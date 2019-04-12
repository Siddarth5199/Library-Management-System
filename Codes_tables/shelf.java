import java.lang.*;

public class shelf{

	int shelf_ID;
	int snumber;

	public shelf(){ 
	}

	public shelf (int s, int sn){
		shelf_ID=s;
		snumber=sn;
	}

	public int getshelfID() { 
		return shelf_ID; 
	}

	public void setshelfID(int s) { 
		shelf_ID=s; 
	}

	public void setshelf(int sn){ 
		snumber=sn ;
	}

	public int getshelfN() {
	 	return snumber;
	}


	public void print(){
		 System.out.println("shelf ID=" + shelf_ID); 
		 System.out.println("shelf number=" + snumber);
	}
};

