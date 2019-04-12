//STEP 1. Import required packages
import java.sql.*;

public class Demo {
	public static void main(String[] args) {
		try{
			DAO_Factory daoFactory = new DAO_Factory();

			daoFactory.activateConnection();

			shelf s1 = new shelf(1,10);
			shelf s2 = new shelf(2,20);

			shelfDAO shelf = daoFactory.getshelfDAO();

			shelf.addshelf(s1);
			shelf.addshelf(s2);

			
			booksDAO sdao = daoFactory.getbooksDAO();

			borrowable_booksDAO sbdao = daoFactory.getbbooksDAO();






			// search by key
			//add book
			books b1 = new books(1008,"potter1","j.k rowling",1,1);

			sdao.addbook(b1,s1);

			books bk1 = sdao.getbookByKey(1008);
			bk1.print();
			

			// search by name
			//add book
			books b2 = new books(1009,"potter2","j.k rowling",1,2);
			
			sdao.addbook(b2,s2);

			books bk2 = sdao.getbookByName("potter2");
			bk2.print();


			// search by author
			//add book
			books b3 = new books(1007,"potter3","j.k rowling",1,1);
			sdao.addbook(b3,s1);

			books bk3 = sdao.getbookByAuthor("j.k rowling");
			bk3.print();

			//remove book
			sdao.removebook(bk1);
			sdao.removebook(bk2);
			sdao.removebook(bk3);






			borrowable_books b4 = new borrowable_books(1010,"potter4","j.k rowling",1,2,true);
			

			sbdao.addbook(b4,s2);

			borrowable_books bk4 = sbdao.getbookByKey(1010);
			bk4.print();

			sbdao.removebook(bk4);

			// search by name
			borrowable_books b5 = new borrowable_books(1011,"potter5","j.k rowling",1,1,true);
	

			sbdao.addbook(b5,s1);

			borrowable_books bk5 = sbdao.getbookByName("potter5");
			bk5.print();

			sbdao.removebook(bk5);

			// search by author
			borrowable_books b6 = new borrowable_books(1012,"potter6","j.k rowling",1,2,false);
			

			sbdao.addbook(b6,s2);

			borrowable_books bk6 = sbdao.getbookByAuthor("j.k rowling");
			bk6.print();

		
			sbdao.removebook(bk6);


			shelf.removeshelf(s1);
			shelf.removeshelf(s2);



			daoFactory.deactivateConnection();
		}catch(Exception e){
				//Handle errors for Class.forName
				e.printStackTrace();
		}
	}//end main
}//end FirstExample



       //OUTPUT

// Connecting to database...
// Mon Nov 26 19:42:06 IST 2018 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
// shelf: id 1, added to the database
// shelf: id 2, added to the database
// books: ISBN 1008, added to the database
// books ID=1008
// books name=potter1
// books author=j.k rowling
// books edition=1
// books shelf_ID=1
// books: ISBN 1009, added to the database
// books ID=1009
// books name=potter2
// books author=j.k rowling
// books edition=1
// books shelf_ID=2
// books: ISBN 1007, added to the database
// books ID=1007
// books name=potter3
// books author=j.k rowling
// books edition=1
// books shelf_ID=1
// books: name potter1, deleted from the database
// books: name potter2, deleted from the database
// books: name potter3, deleted from the database
// books: ISBN 1010, added to the database
// borrowable_books: ISBN 1010 status of the book true , added to the database
// borrowable_books ID= 1010
// borrowable_books status= true
// books ID=1010
// books name=potter4
// books author=j.k rowling
// books edition=1
// books shelf_ID=2
// books: name potter4, deleted from the database
// borrowable_books: name potter4, deleted from the database
// books: ISBN 1011, added to the database
// borrowable_books: ISBN 1011 status of the book true , added to the database
// borrowable_books ID= 1011
// borrowable_books status= true
// books ID=1011
// books name=potter5
// books author=j.k rowling
// books edition=1
// books shelf_ID=1
// books: name potter5, deleted from the database
// borrowable_books: name potter5, deleted from the database
// books: ISBN 1012, added to the database
// borrowable_books: ISBN 1012 status of the book false , added to the database
// borrowable_books ID= 1012
// borrowable_books status= false
// books ID=1012
// books name=potter6
// books author=j.k rowling
// books edition=1
// books shelf_ID=2
// books: name potter6, deleted from the database
// borrowable_books: name potter6, deleted from the database
// shelf: id 1, deleted from the database
// shelf: id 2, deleted from the database
