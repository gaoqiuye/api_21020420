package com.zlearing.java.myself;

class Animall{
	public void movee(){
		System.out.println("run");
	}
}

//Super关键字的使用：当需要在子类中调用父类的被重写方法时，要使用super关键字
class Dogg extends Animall{
	public void movee() {
		//super.movee();
		System.out.println("stop");
		
	}
}


public class TestDogSuper{
  public static void main(String args[]){

     Animall b = new Dogg(); // Dog 对象
     b.movee(); //执行 Dog类的方法

  }
}