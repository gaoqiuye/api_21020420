package com.lemon.java.interfaced;

import java.awt.Window.Type;

public class StringApi {

	 public static void main(String[] args) {
		String address1="abc,DEF广东省,深圳市:南山区南";
		String address2="广东省深圳市宝安区";
		String address3="";
		
		System.out.println(address1.substring(3,6)); //从第三个开始取，到第5个结束		 
		System.out.println(address1.equals(address2));
		System.out.println(address1.contains("深圳"));
		System.out.println(address1.indexOf("南"));
		System.out.println(address1.lastIndexOf("南"));
		System.out.println(address2.isEmpty());//false
		System.out.println(address3.isEmpty());//true
		System.out.println(address1.toUpperCase());
		System.out.println(address1.toLowerCase());
		System.out.println(address1.length());
		System.out.println(address3.length());
		
		System.out.println(address1.charAt(2));
		String[] adss= address1.split(","); //切分之后是个一维数组
		for(String a:adss) {
			System.out.println(a);
			 
		}
	}

}
/*
 * equals():判断两个数据是否一样
 * equalIgnoreCase:判断两个数据是否一样，并且忽略大小写
 * contains():判断是否包含某个信息
 * indexOf():获取字符串中某个内容第一次出现的索引位置
 * lastIndexOf():字符串中某个内容最后一次出现的索引位置
 * isEmplty():判断是否为空 
 * subString():截取字符串
 * toUpperCase():将字符串转换为大写
 * toLOwerCase():将字符串转化为小写
 * length():获取字符串的长度
 * split():按照某个正则表达式来切分字符串
 * chatAt():获取指定位置上的字符
 * 
 */





