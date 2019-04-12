import java.lang.*;

public class research_papers{
    int research_id;
    int faculty_id;
    String topic;
    String faculty_name;
	public research_papers() { }
	public research_papers (int a,int b,String s1,String s2){ research_id=a; faculty_id=b;topic=s1;faculty_name=s2;  }
    
    public String getresearch_id() { return research_id; }
    public void setresearch_id(int s){ research_id=s; }
    
	public int getfaculty_id() { return faculty_id; }
    public void setfaculty_id(int s){ faculty_id = s; }

    public int get_topic() { return topic; }
    public void set_topic(int s){ topic = s; }
    
    public int getfaculty_name() { return faculty_name; }
    public void setfaculty_name(Date s) {faculty_name  = s; }
    
    public void print()
    { 
        System.out.println("research_id=" + research_id); 
        System.out.println("faculty_id=" + faculty_id);
        System.out.println("topic=" + topic); 
        System.out.println("faculty_name=" + faculty_name); 
    }
};

