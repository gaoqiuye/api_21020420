package com.lemon.java.homework;

/*输出 
* * 
* **
* *** 
* ****
* *****
*/
//100以内奇数和，偶数和
public class HomeWork {

	public static void main(String[] args) {
	
		//用外层循环来控制行数
		for (int i = 1; i <= 5; i++) {
			//打印每一行的内容
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			//输出完一行内容后再换行
			System.out.println();
		}
		System.out.println("============");
		
		//100以内奇数和，偶数和
		int jishusum=0;
		int oushusum=0;
		for (int i = 0; i <=100; i++) {
			if(i%2==0) {
				jishusum+=i;
				
			}else {
				oushusum+=i;
				
			}
		
		}

		System.out.println("奇数和："+jishusum);
		System.out.println("偶数和："+oushusum);
	}

}
