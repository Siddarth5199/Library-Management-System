import java.lang.*;

public class borrowable_books{

	int bbook_ID;
	boolean status;

	public borrowable_books(){ 
	}

	public borrowable_books (int s,boolean b){
		bbook_ID=s;
		status=b;
	}

	public int getbbook_ID() { 
		return bbook_ID; 
	}


	public boolean getstatus() {
	 	return status;
	}

	public void setstatus(boolean b) {
	 	status=b;
	}

	public void print(){
		 System.out.println("borrowable_books ID=" + bbook_ID); 
		 System.out.println("borrowable_books status=" + status);
	}
};

