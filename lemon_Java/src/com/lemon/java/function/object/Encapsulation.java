package com.lemon.java.function.object;

/*
 * 
 * Java三大特性：
 * 一。封装：提高代码阅读性，可维护性
 * 
 * 二。继承：提高代码复用性，可维护性,通过extend关键字可以申明一个类是从另一个类继承而来的
 * 		语法：public class 父类{}
 * 		public class 子类 extend 父类{}
 * 
 * 		注意：子类不能继承父类的private成员（属性，方法）
 * 				java是单继承（一个类只能继承于一个类）
 * 				创建本类对象直接会先初始化父类对象
 * 
 * super关键字：通过super关键字来实现对父类成员的访问，用来引用当前对象的父类
 * this关键字：指向自己的引用
 * 
 * final关键字：final关键字声明类可以把 类定义为不能继承的，即最终类；或者用于修饰方法，该方法不能被子类重写
 * 语法：
 * 声明类： final class 类名{//类体}
 * 声明方法：修饰符（public/private/default/protected） final 返回值类型 方法名(){//方法体}
 * 
 * public:公有，所有类都可以访问
 * protected：保护，同一类，同一包，不同包的子类可以访问
 * default：同一类，同一包可以访问
 * private：私有，只有同一类中可访问
 * 
 * 三。多态：用父类的类型来接收子类的对象
 * 
 * 
 */	




public class Encapsulation { 
	public static void main(String[] args) {
		Student student=new Student();
		student.setAge(28);
		
	}
	

}
