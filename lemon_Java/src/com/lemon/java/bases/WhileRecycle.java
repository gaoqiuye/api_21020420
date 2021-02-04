 package com.lemon.java.bases;

public class WhileRecycle {
	
	/*基本语法：
	 * do{
	 * 
	 * }while
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("do--while");
		int x=-1;
		do {
			System.out.println(x);//-1,0 12345
			x++;
			
		} while (x>=0&&x<=5);//012345
		System.out.println(x);
		
		System.out.println("while");
		int y=0;
		while(y>=0&&y<=5) {
			System.out.println(y);
			y++;
		}
		System.out.println("条件为假直接跳出循环体");
		System.out.println(y);
	}

}
