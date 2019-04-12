import java.lang.*;

public class issue_log{
    int issue_id;
    int book_id;
    int student_id;
    Date date_issued;
    Date expec_return;
    Date return_date;
	public issue_log() { }
	public issue_log (int a,int b,int c,Date d,Date e,Date f){ issue_id=a; book_id=b; student_id=c; date_issued=d; expec_return=e; return_date=f; }
    
    public String getissue_id() { return issue_id; }
    public void setissue_id(int s){ issue_id=s; }
    
	public int getbook_id() { return book_id; }
    public void setbook_id(int s){ book_id = s; }

    public int getstudent_id() { return student_id; }
    public void setstudent_id(int s){ student_id = s; }
    
    public int getdate_issued() { return date_issued; }
    public void setdate_issued(Date s){ date_issued = s; }
    
    public int getexpec_return() { return expec_return; }
    public void setexpec_return(Date s){ expec_return = s; }
    
    public int getreturn_date() { return return_date; }
    public void setreturn_date(Date s){ return_date = s; }
    
    
    public void print()
    { 
        System.out.println("issue_id=" + issue_id); 
        System.out.println("book_id=" + name);
        System.out.println("student_id=" + student_id); 
        System.out.println("date_issued=" + date_issued); 
        System.out.println("expec_return=" + expec_return); 
        System.out.println("return_date=" + return_date); 
    }
};

