package com.lemon.java.homework;

/*
 * 1.定义学生类：Student
 * 2.创建学生1
 * 3.创建学生2
 * 4.创建学生3
 * 5.往list对象中添加三个学生对象
 * 6.删除第三个学生对象
 * 7.取出第一个学生，将对象name改成王五
 * 8.通过三种循环取出list集合里面的所有学生数据，打印name，age，gender属性的值 
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;

public class StudentHomework {
	public static void main(String[] args) {
		Student studengt1= new Student("zhangsan",25,"nan");
		Student studengt2=new Student("lisi",26,"nan");
		Student studengt3=new Student("xiaohua",27,"nv");
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(studengt1);
		list.add(studengt2);
		list.add(studengt3);
		//System.out.println(list);
		//list.remove(2);
		System.out.println("===这里直接用s1===");
		studengt1=list.get(0);
		studengt1.setName("wangwu");
		//studengt1.name="wangwu";
		System.out.println(studengt1.getName());
		System.out.println(studengt1.getAge());
		System.out.println(studengt1.getGender());
		
		System.out.println("==这里可以重新创建一个对象来取出第一一个学生===");
		Student student4=list.get(0);
		student4.setName("王五");
		System.out.println(student4.getName());
		System.out.println(student4.getAge());
		System.out.println(student4.getGender());
		
		
		
		System.out.println(list.size());
//		for(int i=0;i<list.size();i++) {
//			Student student= list.get(i);
//			System.out.println("姓名:"+student.getName()+","+"年龄:"+student.getAge()+";");
//		}
		
		//for循环
		for(int i=0;i<list.size();i++) {
			Student student= list.get(i);
			//System.out.println(student);
			System.out.println(student.toString());
		}
		
		//增强for循环遍历
		for(Student student:list) {
			System.out.println(student);
		}
		
		//迭代
		System.out.println("===迭代====");
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(student);
		}

	}
 
}
