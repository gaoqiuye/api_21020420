package com.lemon.java.function.object;

public class Mobilephone {
	//全局变量
	public String brand; 
	public String generation; 
	public  int price; 
	
	//给手机设置品牌，型号和价格
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setGeneration(String generation) {
		this.generation=generation;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	//获取手机品牌，型号和价格
	public String getBrand1() {
		return this.brand;
	}
	public String getGeneration() {
		return this.generation;
	}
	public int getPrice() {
		return this.price;
	}
	
	
	//发短信
	public void sendMessage(String name) {
		System.out.println(name+" 你在哪？");	
		System.out.println("这条短信是通过["+this.brand+",价格"+this.price+",型号为"+this.generation+"]来发送的~");
	}
	
	//无参构造函数
	public Mobilephone() {
		
	}
	//带参构造函数
	public Mobilephone(String brand,String generation,int price) {
		this.brand=brand;
		this.generation=generation;
		this.price=price;
	}
	

	
	
	public static void main(String[] args) {
		Mobilephone mobilephone=new Mobilephone("华为","P20",888);
		String name="小红";
		mobilephone.sendMessage(name);
		
		Mobilephone mobilephone2=new Mobilephone();
		String name2="小米";
		mobilephone2.sendMessage(name2);
		mobilephone2.sendMessage("2"+mobilephone2);
		
		Mobilephone mobilephone3=new Mobilephone();
		String brand3=mobilephone3.getBrand1();
		//System.out.println(brand3);
		Mobilephone mobilephone4=new Mobilephone();
		//给mobilephone4设置一个品牌：小米 
		mobilephone4.setBrand("小米");
		mobilephone4.setGeneration("2代");
		mobilephone4.setPrice(1888); 
		
		//取mobilephone4的品牌，型号和价格
		String brand4=mobilephone4.getBrand()  ;
		String generation4=mobilephone4.getGeneration();
		int price4= mobilephone4.getPrice();
		System.out.println("品牌是："+brand4+"型号是:"+generation4+"价格是:"+price4);
		
	}
	
	public String getBrand() {
		return this.brand; //return作用：返回数据；结束这个函数
		
	}
	
	
	
	
}
