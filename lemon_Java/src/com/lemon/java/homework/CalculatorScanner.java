package com.lemon.java.homework;

import java.util.Scanner;
 

//1.写一个简单的计算器Calculator,定义4个函数，实现两个数据的加减乘除
//2.实现一个计算器，支持控制台输入数据，输入运算符来完成运算
//3.要导出可执行的jar包，通过bat批处理文件来运行程序

public class CalculatorScanner {
	public double add(double a,double b) {
		return a+b;
	}
	public double substract(double a,double b) {
		return a-b;
	}
	public double multiply(double a,double b) {
		return a*b;
	}
	public double divide(double a,double b) {
		return a/b;
	}
	
//	public static void main(String[] args) {
//		double a=3;
//		double b=4;
//		Calculator calculator = new Calculator();
//		calculator.add(a, b);
//		calculator.substract(a, b);
//		System.out.println(calculator.add(a, b));
//	}
	
	public static void main(String[] args) {
		//Scanner,通过此类可以实现控制台数据输入（流程控制）
		//要使用Scanner类来创建对象，首先到将此类引入到我们当前类
		//通过Scanner类来获取用户的输入 Scanner scanner=new Scanner(System.in)
		//通过Scanner类的next()与nextLine()方法获取输入的字符串，在读取前需要使用hasNext与hasNextLine判断是否还有输入的数据：
		
		Scanner scanner=new Scanner(System.in);
		CalculatorScanner calculator = new CalculatorScanner();
		//输入第一个数据
		System.out.println("请输入第一个数据:");
		
		//获取控制台输入的数据
	    double a= scanner.nextDouble();
	    
		//输入运算符
	    System.out.println("请输入运算符:");
	    String operator = scanner.next();
	    
		//输入第二个数据
	    System.out.println("请输入第二个数据:");
	    
	  //获取控制台输入的数据
	  	double b= scanner.nextDouble();
	  	double result=0;
		//根据输入的运算符，调用相应的方法完成数据运算
	  	if("+".equals(operator)) {
	  		//完成加法运算
	  		result=calculator.add(a, b);
	  	}
	  	else if("-".equals(operator)) {
	  		//完成加法运算
	  		result=calculator.substract(a, b);
	  	}
	  	else  if("*".equals(operator)) {
	  		//完成加法运算
	  		result=calculator.multiply(a, b);
	  	}
	  	else if("/".equals(operator)) {
	  		//完成加法运算
	  		result=calculator.divide(a, b);
	  	}
	  	
	  	//输出结果
	  	System.out.println("最后结果为:"+result);
	}

}

