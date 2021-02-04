package com.lemon.java.function.object;

public class Iphone5 extends Iphone4s{
	public static void main(String[] args) {
		//用Iphone5发短信
		//Iphone5 iphone5=new Iphone5();//无参构造函数
		Iphone5 iphone5=new Iphone5("iphone 5s");
		iphone5.sendMessage();
		System.out.println(iphone5.brand);
		iphone5.test();
	}
	
	public String brand="iphone 5";  //覆盖父类的品牌
	
	public Iphone5 (String brand) {
		//super();//调用的是父类 iphone4默认的构造函数   一般不写这一行，但是代码在运行时会默认执行这一行
		super("4sss");
		this.brand=brand;
	}
	
	
//	public void test() {
//		System.out.println("子类iphone5的测试方法");
//	}

	
	//输入父类中的test后根据提示...
//	public void test() {
//		System.out.println("子类的测试方法");
//	}
	
	public void test() {
		//System.out.println("Iphone5.test()");
		super.test();;
	}
	 
//	public Iphone5() {
//		System.out.println("Iphone5.Iphone5()");
//	}
}
