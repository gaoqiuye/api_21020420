package com.lemon.java.xiushifu_static;

public class Tester {
	private String name="张三";
	
	static {//完成数据的初始化
		
	}
	
	public static void main(String[] args) {
		Student student1=new Student("zhangsan",25,"nan");
		Student student2=new Student("wangwu",26,"nv");
		System.out.println(student1.toString());
		System.out.println(student2);//不写的话默认.toString
//		Tester tester=new Tester();  
//		tester.sayHi();
		Tester.sayHi(); //静态成员的访问不需要依赖对象，可以直接通过类名来访问
		
	}

	public static void sayHi() {
		//static修饰函数时，此函数内无法访问到 函数外定义的非static类型的全局变量
		//所以在这个函数里，无法访问到 【private String name】里的name---System.out.println(name)---这种是不对的;
		System.out.println("Hi");
	}

}
