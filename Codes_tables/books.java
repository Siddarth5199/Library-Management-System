import java.lang.*;

public class books{

	int ISBN;
	String bookname;
	String author; 
	int edition_b;
	int shelf_ID;

	public books(){ 
	}

	public books (int s, String sn, String a,int e, int si){
		ISBN=s;
		bookname=sn;
		author=a; 
		edition_b=e;
		shelf_ID=si;
	}

	public int getbbook_ID() { 
		return ISBN; 
	}

	public String getName() {
	 	return bookname;
	}

	public String getauthor() {
	 	return author;
	}

	public int edition() { 
		return edition_b; 
	}

	public int getshelf_ID() { 
		return shelf_ID; 
	}

	public void setbbook_ID(int id) { 
		ISBN=id; 
	}

	public void setName(String name) {
	 	bookname=name;
	}

	public void setauthor(String name) {
	 	author=name;
	}

	public void setedition(int e) { 
		edition_b=e; 
	}

	public void print(){
		 System.out.println("books ID=" + ISBN); 
		 System.out.println("books name=" + bookname);
		 System.out.println("books author=" + author);
		 System.out.println("books edition=" + edition_b);
		 System.out.println("books shelf_ID=" + shelf_ID);
	}
};

