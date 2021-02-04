package com.lemon.java.xiushifu_static;
/*
 * 非访问修饰符：static
 * static修饰变量，则此变量在内存中只保留一份。(不常变动的数据适合声明为静态的)
 * static修饰函数时，此函数内无法访问到 函数外定义的非static类型的全局变量
 * 
 * 类在加载到内存的时候 最先加载进来的部分是被static修饰的静态成员
 * 
 *=== 静态成员的访问不需要依赖对象，可以直接通过类名来访问
 *
 *☆☆☆☆☆☆静态代码块
 *
 *
 *非访问修饰符：final
 *1.被final修饰的变量，他的值不能再被修改
 *2.被final修饰的函数，不能被重写
 *3.被final修饰的类，不能被继承
 * 
 * 非访问修饰符：abstract
 * 
 */
public class Student {
	//姓名
	private static String name;
	
	//年龄
	private static int age;
	
	//性别
	private static String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(String name, int age, String gender) {

		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Student() {

	}
//重写
	@Override
	public String toString() {
		return "姓名:" + this.name + "；年龄:" + this.age + "；性别:" + this.gender;
	}

}
