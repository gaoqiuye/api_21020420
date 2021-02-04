package com.lemon.java.interfaced.abstracts;

public abstract class Worker {
	/*
	 * 工作方法
	 * 定义抽象的方法，是想让子类实现差异化的内容
	 */
		public abstract void work();
		
		public  void showDairly() {
			System.out.println("起床");
			System.out.println("上班");
			work();
			System.out.println("下班");
		}
}
