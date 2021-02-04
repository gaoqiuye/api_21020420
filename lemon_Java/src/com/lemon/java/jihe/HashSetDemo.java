package com.lemon.java.jihe;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
	HashSet<String> set =new HashSet<String>();
	System.out.println(set.size());
	System.out.println(set.isEmpty());
	set.add("1");
	set.add("2");
	set.add("3");
	set.add("2");
	System.out.println(set.size()); //重复的数据没有统计
	System.out.println(set.isEmpty());
	set.remove("2"); //因为HashSetDemo是无序，所以索引不适用
	System.out.println(set);
	System.out.println("=======");
	//没有get取值的方法
	Object[] objects=set.toArray();
	for (Object object:objects) {
		//System.out.print(object);	
	}
	
	//迭代（遍历）set集合
	Iterator<String>  ite = set.iterator();
	while (ite.hasNext()) {//判断是否有下一个数据
		System.out.println(ite.next()); //取出数据
		
	}
	System.out.println("hi");
	for (String name:set) {
		System.out.println(name);
	}
}
}
