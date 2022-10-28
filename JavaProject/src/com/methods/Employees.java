package com.methods;

public class Employees {
String name;
String designation;
String domine;
int salary;
int totalexp;
int workinghrs;
int holidays;
public Employees(String name1, String domine1,int salary1) {
	this.name=name1;
	this.domine=domine1;
	this.salary=salary1;
	}
public void project(String p) {
	System.out.println("Project name is Insurance");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e = new Employees("pravs","Testing" , 80000);
		System.out.println(e.domine);
		System.out.println(e.name);
		System.out.println(e.salary);
		e.project("insurance");

	}

}
