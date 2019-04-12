import java.lang.*;

public class admin{
    int admin_id;
    int salary;
	public admin() { }
	public admin (int a,int b){ admin_id=a; salary=b; }
    
    public String getadmin_id() { return admin_id; }
    public void setadmin_id(int s){ admin_id=s; }
    
	public int get_salary() { return salary; }
    public void set_salary(int s){ salary = s; }
    
    public void print()
    { 
        System.out.println("admin_id=" + admin_id); 
        System.out.println("salary=" + salary); 
    }
};

