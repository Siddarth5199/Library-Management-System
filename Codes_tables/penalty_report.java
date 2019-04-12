import java.lang.*;

public class penalty_report{
    int penalty_id;
    int issue_id;
    int amount;
    String description;
	public penalty_report() { }
	public penalty_report (int a,int b,int c,String s){ penalty_id=a; issue_id=b; amount=c; description=s; }
    
    public String getissue_id() { return issue_id; }
    public void setissue_id(int s){ issue_id=s; }
    
	public int getpenalty_id() { return penalty_id; }
    public void setpenalty_id(int s){ penalty_id = s; }

    public int get_amount() { return amount; }
    public void set_amount(int s){ amount = s; }
    
    public int get_description() { return description; }
    public void set_description(String s){ description = s; }
    
    public void print()
    { 
        System.out.println("penaly_id=" + penalty_id); 
        System.out.println("issue_id=" + issue_id);
        System.out.println("amount=" + amount); 
        System.out.println("description=" + description); 
    }
};

