package main;

import java.util.ArrayList;

public class Quiz5 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
	}

}

class Student {
	int studentID ;
	String studentName;
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}
	
}
