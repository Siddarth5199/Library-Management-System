import java.lang.*;

public class Librarian{
	int librarian_ID;
	int salary;
	String work_shift;

	public int getLibrarianId(){return librarian_ID;}
	public int getLibrarianSalary(){return salary;}
	public String getLibrarianWorkShift() {return work_shift;}
	// public Student() { }
	// public Student (String s, int r){ rollno = r; name = s; }
	// public String getName() { return name; }
	// public void setName(String s){ name = s; }
	// public int getRollno() { return rollno; }
	// public void setRollno(int s){ rollno = s; }
	public void print(){System.out.println("librarian_ID=" + librarian_ID); System.out.println("lname=" + lname); System.out.println("salary=" + salary);System.out.println("work_shift=" + work_shift);}
};