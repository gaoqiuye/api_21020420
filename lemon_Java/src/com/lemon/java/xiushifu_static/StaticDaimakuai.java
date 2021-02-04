package com.lemon.java.xiushifu_static;

public class StaticDaimakuai extends Parent{
	
	static {//完成数据的初始化，这里的内容最先执行
		System.out.println("静态代码块");
	}
	
	public static void main(String[] args) {
		System.out.println("Tester2.main()");
		StaticDaimakuai tester = new StaticDaimakuai(); //调用了这个构造函数创建了一个对象（调用的过程中执行了构造函数中的函数体）
		tester.sayHi();
 	
	}
	
	public  StaticDaimakuai() {
		System.out.println("Tester.Tester()");
	} 

	public void sayHi() {
		System.out.println("Tester2.sayHi()");
	}

}

/*

静态代码块
Tester2.main()
Tester.Tester()
Tester2.sayHi()
*/