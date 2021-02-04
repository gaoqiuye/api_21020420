package com.zlearing.java.myself;

/*
 * toString(): 返回表示 Integer 值的 String 对象。
 *  toString(int i): 返回表示指定 int 的 String 对象。
 *  
 */


public class GetType {
	 public static void main(String args[]){
	        Integer x = 5;
	   
	        System.out.println(x.toString());  
	        System.out.println(Integer.toString(12)); 
	        System.out.println(Integer.toString(12).getClass().toString());
	        System.out.println(Integer.toString(12).getClass().getName().toString());
	      
	    }

}
