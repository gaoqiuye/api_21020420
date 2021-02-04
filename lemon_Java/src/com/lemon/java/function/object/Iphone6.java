package com.lemon.java.function.object;

public class Iphone6 extends Iphone5s{
	public Iphone6(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//用Iphone5发短信
		Iphone6 iphone6=new Iphone6("6");
		iphone6.sendMessage();
	}
	
	public void shape() {
		System.out.println("iphone6特有的外形");
	}
 
}
 