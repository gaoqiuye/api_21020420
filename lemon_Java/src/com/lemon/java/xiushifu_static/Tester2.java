package com.lemon.java.xiushifu_static;

public class Tester2 extends Tester3 {
	/*
	 * final最终的，修饰的变量不能改变==常量
	 */
	public final int age=25;
	public static void main(String[] args) {
//		Tester3 tester3=new Tester3();
//		System.out.println(tester3.name);
		System.err.println(Tester3.name);//静态成员的访问不需要依赖对象，可以直接通过类名来访问
		
		
	}
	@Override
	public void test() {
		System.out.println("Tester2.test()");
	}
}


