package Org.student;

import Org.department.Department;

public class Student extends Department{
	public void studentname() {
		System.out.println("studentname");
	}
	public void studentDept() {
		System.out.println("studentDept");
	}
	public void studentid() {
		System.out.println("studentid");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.studentname();
		obj.studentDept();
		obj.studentid();
		obj.collegename();
		obj.collegecode();
		obj.collegerank();
		obj.deptName();
		
	}

}
