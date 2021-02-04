package com.lemon.java.interfaced;

public class Tester {

	public void showWork(Woker worker) {
		worker.work();
	}
	
	public static void main(String[] args) {
		Cooker cooker=new Cooker();
		Teacher teacher= new Teacher ();
		Doctor doctor = new Doctor();
		Tester tester=new Tester();
		tester.showWork(cooker);
		tester.showWork(teacher);
		tester.showWork(doctor);
		
	}
}
