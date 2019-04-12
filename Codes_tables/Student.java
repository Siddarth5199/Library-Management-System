import java.lang.*;

public class Student{
	int student_ID;
	String program;
	String rollno;

	// public Student() { }
	// public Student (String s, int r){ rollno = r; name = s; }
	public int getStudentId() { return student_ID ;}
	// public void setName(String s){ name = s; }
	public String getRollno() { return rollno; }
	// public void setRollno(int s){ rollno = s; }
	public String print(){ System.out.println("rollno=" + rollno); System.out.println("Name=" + sname);System.out.println("Program=" + program);System.out.println("student_ID=" + student_ID);}
};

