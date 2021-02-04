package com.lemon.java.function.object;

/*
 * 父类（基类）
 * 
 * 
 */
public class Iphone4s {

	public String brand="iphone4s";
	
	public void makeCall() {
		System.out.println("打电话");
		
	}
	public void sendMessage() {
		System.out.println("发短信");
		
	}
	public void passwordUnlock() {
		System.out.println("密码解锁");
		
	}
	public void test() {
		System.out.println("父类的测试方法:Iphone4s.test()");
	}
	
//	public Iphone4s() {
//		System.out.println("Iphone4s.Iphone4s()");
//	}
	public Iphone4s(String brand) {
	//System.out.println("Iphone4s.Iphone4s()");
}
}
