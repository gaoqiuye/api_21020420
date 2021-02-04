package com.lemon.java.function.object;

/*
 * this:代表的是一个对象的引用--》一个对象
 */
public class Mobile {
	/*品牌*/
	public String brand;
	/*价格*/
	public int price;
	//发送消息
	public void sendMessage(String name) {
		System.out.println("hello"+name+"hi");
		System.out.println("品牌为"+brand+",价格为"+price);
	}
	
	public String getMobileInfo() {
		return "手机品牌是："+this.brand+",手机价格是："+this.price;
	} 
	
	
	/*
	 * 无参构造函数，作用：创建一个原始的对象
	 * 
	 */
	public Mobile() {
		
	}
	
	/*
	 * 带参构造函数。作用：能够初始化一个对象
	 */
	public Mobile (String brand,int price) {//形参
		this.brand=brand;
		this.price=price;		
	}
	
	public static void main(String[] args) {
		
		//通过调用无参构造函数，创建一个原始对象
		Mobile mobile1=new Mobile();
		//调用带参构造函数，创建一个对象，
		Mobile mobile2= new Mobile("华为",999);
		
		//显示手机的品牌信息和价格
		String info1=mobile1.getMobileInfo();
		String info2=mobile2.getMobileInfo();
		System.out.println(info1);
		System.out.println(info2);
		
		mobile2.sendMessage("小白");
		
				
		
	}
	
}
