package com.zlearing.java.myself;

/*
 *  
 */


public class GettoString {
	public static String getType(Object test) {
		return test.getClass().getName().toString();
		
	}
	public static void main(String[] args) {
		int i = 1;
		
		System.out.println(getType(i));

}

}