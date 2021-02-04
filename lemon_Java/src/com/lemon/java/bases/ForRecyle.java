package com.lemon.java.bases;

public class ForRecyle {
	

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			//语法解释：i代表循环开始的值，
			//第二个表达式“i<=10"代表的是循环下去的条件，只有满足条件，循环才会走下去，才会执行循环体
			//i++代表走完了一次循环，所以i要加1；三个表达式直接用;隔开
			
			//执行顺序：i被初始化为1
			//i<=10成立，执行循环体...
			//i=10,成立，执行循环体，i++后变成11，不成立，不再执行循环体。
			
			if (i==3) {
				continue;//continue跳过本次循环
			}
			
			if (i==5) {
				break;
				
			}
			System.out.print(i);
		} 
		System.out.println("");
		//求1-100的和
		int result=0;
		for(int i=1;i<=100;i++) {
			result+=i;
		}
		System.out.println(result);
		String []names = {"a","b","c"} ;
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]);
		}
		
		System.out.println();
		//增强for循环
		for(String name:names) {
			System.out.print(name);
		}

	}
}
