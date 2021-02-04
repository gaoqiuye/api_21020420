package com.lemon.java.bases;

/*多个if..if..if并列使用。判断原则，按照顺序来判断，不管条件是否满足，每个条件都会判断一次
 * if...else if..else 按照顺序来判断，一旦满足了某个条件，就不再执行其他的判断
 * 
 * 
 */

public class IfDemo {
	public static void main(String[] args) {
		int score=85;
//		if(score>=60) {
//			System.out.println("good");
//		}
//		if(score<60) {
//			System.out.println("bad");
//		}
		
		if(score>=85) {
			System.out.println("perfect");
		}
		else if(score>=60 &&score<85) {
			System.out.println("great");
		}else {
			System.out.println("bad");
		}
		System.out.println(score );
		
		//A?B:C
		int a=1;
		int b=2;
		if(a>b) {
			System.out.println("大于");
		}else {
			System.out.println("小于");
		}
		System.out.println("=====");
		System.out.println(a>b?"大于":"小于等于");
		
		
		
		
	}

}
