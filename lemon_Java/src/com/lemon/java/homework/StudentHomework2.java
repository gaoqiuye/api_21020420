package com.lemon.java.homework;

//import java.awt.List;
/*
 * 1.有两个班级，1801，1802；1801班有三个学生ABC，1802班有两个学生DE
 *   A:name-张三,age-25,gender--男
 * 用map保存好两个班级的学生数据，每个班级底下保存对应的学生信息，那map集合的键和值该是什么类型呢
 * 2.用两种循环遍历map集合取出每个班级底下的学员数据，并输出
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentHomework2 {
	 public static void main(String[] args) {
		StudentHomework2 homework2=new StudentHomework2();
		homework2.test1();
	}
		
	
	public void test1() {
		Map<String, ArrayList<Student>> map= new HashMap<String, ArrayList<Student>>();
		ArrayList<Student> list=new ArrayList<Student>();
		Student studentA=new Student("zhangsan",25,"nan");
		Student studentB=new Student("李四",26,"nan");
		Student studentC=new Student("小花",27,"女");
		list.add(studentA);
		list.add(studentB);
		list.add(studentC);
		String class1="1801";
		map.put(class1, list);
		
		Student studentD=new Student("小米",28,"nan");
		Student studentE=new Student("小草",29,"nan");
		ArrayList<Student> list2=new ArrayList<Student>();
		list2.add(studentD);
		list2.add(studentE);
		String class2="1802";
		map.put(class2, list2);
		
		//map遍历
		Set<String> classNames=map.keySet();
		for (String className:classNames) {
			System.out.println("班级名称："+className);
			ArrayList<Student> list3=map.get(className);
			//System.out.println(list3);
			for(Student student:list3) {
				System.out.println(student);
			}
				}
			
		}
		

	
	public void test2() {
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

