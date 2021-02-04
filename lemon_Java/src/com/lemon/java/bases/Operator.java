package com.lemon.java.bases;

/*运算符的学习：
 * 算数运算符:/除法；%取余
 * 关系运算符:==,!=,
 * 逻辑运算符：&,&&-短路与(当且仅当两边都为真，结果才为真，如果左边的为假，那后边的表达式就不会执行了)
 * 			|--逻辑或，||--短路（任何一边操作为真，最后结果为真，如果前面的表达式为真，那后面的表达式就不会执行了
 * 			！--逻辑非
 * 赋值运算符：=，+=(a+=1===a=a+1),-=,*=,/=,%=
 * 其他运算符:条件运算符（A?B:C）--三目运算符(ABC依次为表达式，而且A是一个条件表达式，经过运算会得到一个布尔类型的值，如果为真，就执行B表达式，否则执行C表达式)
 * 
 * 运算顺序
 * 	
 */
public class Operator {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		
//		System.out.println(a+b);
//		System.out.println(b-a);
//		System.out.println(a*b);
//		System.err.println(a/b);
//		System.out.println("取余 "+a%b);
		++a;
		a++;
		System.out.println(a);
		System.out.println(a++);
	
		//不管++自增运算符是写在前面还是写在变量后面，此处都只是输出a变量的值，但是如果++运算符放前面，那么变量会为运算符的位置，
		//会先加1，这个时候拿a变量去用的时候就是2，反之，如果在后面，那么同样会因为后面这个位置的特殊性而不会先加1，这个时候拿a变量去用的时候就是1
		System.out.println(++a);
		System.out.println(a);
		System.out.println("====b=====");
		System.out.println(--b);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(a==b);
		//三目运算符A?B:C
		System.out.println((a<b?"大于":"小于"));
		
		 
		
	}

}
