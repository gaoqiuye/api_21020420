package com.lemon.java.bases;

/*作用域：
 * 局部变量：
 * 定义在函数体内；定义在函数参数列表里；代码块中{}
 * 局部变量是无法使用修饰符去修饰的
 * 
 * 全局变量(成员变量)：
 * 定义在类体内；在函数外；在代码块外
 * 
 * 注意：在一个作用域内不能够定义名字一样的变量
 * 
 */
public class Zuoyongyu {
	//成员变量（全局变量）
	String name = "张三";
	static String sex ="boy";
	int age=23;
	
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int age=100;
		System.out.println(a);
		System.out.println(sex);
		System.out.println(age);//就近原则

	}
	public void test() {
		System.out.println("a:"+name);
	}
}

