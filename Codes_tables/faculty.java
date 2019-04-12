import java.lang.*;

public class faculty{
    int faculty_id;
    String department;

	public faculty() { }
	public faculty (int a,int b,int c,Date d,Date e,Date f){ issue_id=a; book_id=b; student_id=c; date_issued=d; expec_return=e; return_date=f; }
    
    public String get_faculty_id() { return faculty_id; }
    public void setfaculty_id(int s){ faculty_id=s; }
    
	public int get_dep() { return department; }
    public void set_dep(String s){ department = s; }
    
    public void print()
    { 
        System.out.println("faculty_id=" + faculty_id); 
        System.out.println("department=" + department); 
    }
};

