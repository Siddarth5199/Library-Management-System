import java.lang.*;

public class Borrower{
	int b_ID;
	String borrower_type;
	public String getBorrowerType(){return borrower_type;}
	public int getBorrowerId(){return b_ID;}
	// public Student() { }
	// public Student (String s, int r){ rollno = r; name = s; }
	// public String getName() { return name; }
	// public void setName(String s){ name = s; }
	// public int getRollno() { return rollno; }
	// public void setRollno(int s){ rollno = s; }
	public void print(){ System.out.println("b_ID=" + b_ID); System.out.println("bname=" + bname);System.out.println("borrower_type=" + borrower_type);}
};

