package com.zlearing.java.myself;

public class TestDuoTai {
    public static void main(String[] args) {
      show(new Cat());  // 以 Cat 对象调用 show 方法
      show(new Doggg());  // 以 Dog 对象调用 show 方法
                
      Animalll a = new Cat();  // 向上转型  
      a.eat();               // 调用的是 Cat 的 eat
      Cat c = (Cat)a;        // 向下转型  
      c.work();        // 调用的是 Cat 的 work
  }  
            
    public static void show(Animalll a)  {
      a.eat();  
        // 类型判断
        if (a instanceof Cat)  {  // 猫做的事情 
            Cat c = (Cat)a;  
            c.work();  
        } else if (a instanceof Doggg) { // 狗做的事情 
            Doggg c = (Doggg)a;  
            c.work();  
        }  
    }  
}
 
abstract class Animalll {  
    abstract void eat();  
}  
  
class Cat extends Animalll {  
    public void eat() {  
        System.out.println("吃鱼");  
    }  
    public void work() {  
        System.out.println("抓老鼠");  
    }  
}  
  
class Doggg extends Animalll {  
    public void eat() {  
        System.out.println("吃骨头");  
    }  
    public void work() {  
        System.out.println("看家");  
    }  
}