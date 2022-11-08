package bean;

import java.util.ArrayList;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList= new ArrayList<>();
		Student s1 = new Student(1,"pravas");
		Student s2 = new Student(2,"toshan");
		Student s3 = new Student(3,"shandeep");
		Student s4 = new Student(4,"keshiya");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		for (Student s : studentList) {
			if (s.getName().startsWith("s")) {
			System.out.println(s.getName());
			}
		}
		
		

	}

}
