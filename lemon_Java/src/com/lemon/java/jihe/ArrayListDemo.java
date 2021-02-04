package com.lemon.java.jihe;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * boolean:Boolean
 * byte：Byte
 * short:Short
 * int:Integer
 * long:Long
 * float:Float
 * double:Double
 * char:Character
 * 
 * 创建List对象
 * ArrayList list=new ArrayList();
 * 添加数据：list.add();
 * 取数据：list.get();
 * 移除数据：list.remove();
 * 获取list集合的大小：list.size();
 * 
 * 其他API（函数）：
 * list.isEmpty();
 * list.contains();
 */
public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>(); //int-->Integer(包装类型)
	System.out.println(list.size());
	list.add("张三1");
	list.add("张三2");
	list.add("张三3");
	list.add("航三");
	list.add("张三3");
	
	System.out.println(list.size());
//	System.out.println(list.isEmpty());
//	System.out.println(list.get(0));
//	//String removeString=list.remove(0); //返回值是 字符串类型的
//	//System.out.println(list.remove(1)); //返回值是布尔类型的
//	System.out.println(list);
//	//boolean isSuccess=list.remove("张三1"); 
//	//System.out.println(isSuccess);
//	System.out.println(list);
//	//list.set(2,"hi"); //修改第三个索引位置对应的值
//	//System.out.println(list.get(2));
//	System.out.println("-----");
	System.out.println(list);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println("=====");
	for(String name:list) {
		System.out.println(name);
	}
	System.out.println("=====");
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
}
}
