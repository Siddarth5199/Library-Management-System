import java.lang.*;

public class recommended_books{
    int book_id;
    String book_name;
    int faculty_id;
    String faculty_name;
	public recommended_books() { }
	public recommended_books (int a,String s1,int b,String s2){ book_id=a; book_name=s1; faculty_id=b; faculty_name=s2;}
    
	public int getbook_id() { return book_id; }
    public void setbook_id(int s){ book_id = s; }

    public int getfaculty_id() { return faculty_id; }
    public void setfaculty_id(int s){ faculty_id = s; }
    
    public int getbook_name() { return book_name; }
    public void setbook_name(String s){ book_name = s; }
    
    public int getfaculty_name() { return faculty_name; }
    public void setfaculty_name(String s){ faculty_name = s; }
    
    public void print()
    { 
        System.out.println("book_id=" + book_id); 
        System.out.println("book_name=" + book_name);
        System.out.println("faculty_id=" + faculty_id); 
        System.out.println("faculty_name=" + faculty_name); 
    }
};

