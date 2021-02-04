package com.lemon.java.function.object;

public class Iphone5s extends Iphone5{
	public Iphone5s(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//用Iphone5发短信
		Iphone5s iphone5s=new Iphone5s("5s");
		iphone5s.sendMessage();
		System.out.println(iphone5s.brand);
	}
 
}
