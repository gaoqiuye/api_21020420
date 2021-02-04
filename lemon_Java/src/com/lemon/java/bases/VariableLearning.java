package com.lemon.java.bases;

/*变量的学习
 * 	1.基本类型：布尔，整型，浮点型，字符型
 * 
 * 	2.引用类型：类，数组
 * 类
 * 		String a="a";
 * 数组
 * 		一维数组
 * 		二维数组
 */
public class VariableLearning {
	public static void main(String[] args) {
		//基本类型：布尔，整型，浮点，字符
		boolean aa=true;
		byte b =1;
		short d=30;
		int c=28;
		
		long e=111;
		float f=2.6f;
		double g=3.14;
		//字符型,用单引号，赋值的数据长度只能是1位
		char hh='1';
		
		//引用类型（指的是一个内存地址）：数组，类， 
		//String:字符串
		String name ="hello";
		int age=99;		
		System.out.println(name+age);
		//数组
		//一维数组
		//场景啊:创建了一个数组，但是没有初始化数组的元素，这种情况需要显示指定数组的大小
		//语法：数据类型 [] 数组名=new 数据类型[size]
		int [] arr1 = new int[4];//int类型的默认值为0，所以此数组里有4个0
		//场景啊；创建一个数组，并已知数组的内部元素
		//语法：类型 []数组名={};
		//定一个数组，已知数组要保存三个姓名
		String [] names = {"zhang","li","wang"};
		System.out.println(arr1[0]);
		//6,7,8,9
		 arr1[0]=6;
		 arr1[1]=7;
		 arr1[2]=8;
		 arr1[3]=9;
		 System.out.println(arr1[0]);
		 System.out.println(arr1[1]);
		 System.out.println(arr1[2]);
		 System.out.println(arr1[3]);
		 System.out.println(names.length);
		 //二维数组
		String [][] names2 = {{"a","b"},{"li","d"},{"wang","e"}}; //相当于三行两列

		 //创建了一个数组，但是没有初始化数组的元素，这种情况需要显示指定数组的大小
		String [][] arr2=new String [3][2];  //3行2列,String类型的默认为null

		//场景啊；创建一个数组，并已知数组的内部元素
		String [][] arr3 = {{"a","b"},{"li","d"},{"wang","e"}}; //相当于三行两列
		String [][] arr4 = {{"a","b"},{"li","d"},{"wang","e","uu"}}; //相当于三行两列
		//取出arr2的第一行第一列数据
		System.out.println(arr2[0][0]);
		//取出arr2的第一行第2列数据
		System.out.println(arr2[0][1]);
		//取出arr2的第2行第一列数据
		System.out.println(arr2[1][0]);
		//取出arr2的第2行第2列数据
		System.out.println(arr2[1][1]);
		//取出arr2的第3行第一列数据
		System.out.println(arr2[2][0]);
		//取出arr2的第3行第2列数据
		System.out.println(arr2[2][1]);
		System.out.println("========");
		arr2[1][1]="hi";
		System.out.println(arr2[1][1]);
		System.out.println(arr4[2][1]);

		
		
		

		 
		 
		 
		 
		

	}

}
