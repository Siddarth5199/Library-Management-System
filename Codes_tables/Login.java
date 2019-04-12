import java.lang.*;

public class Login{
	int login_ID;
	String username;
	String password;
	String user_ID;
	// public Student() { }
	// public Student (String s, int r){ rollno = r; name = s; }
	public String getLoginUserName() { return username; }
	public int getLoginId() { return login_ID; }
	public String getLoginUserId() { return user_ID; }
	public String getLoginPassword() { return password; }
	// public void setName(String s){ name = s; }
	// public int getRollno() { return rollno; }
	// public void setRollno(int s){ rollno = s; }
	public void print(){System.out.println("user_ID=" + user_ID); System.out.println("login_ID=" + login_ID); System.out.println("username=" + username);}
};