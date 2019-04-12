import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class booksDAO_JDBC implements booksDAO {
																																																																																																																																																																																																																																															Connection dbConnection;

	public booksDAO_JDBC(Connection dbconn){
		// JDBC driver bookname and database URL
 		//  Database credentials
		dbConnection = dbconn;
	}

	@Override
	public books getbookByKey(int id) {
		books bk = new books();
		String sql;
		Statement stmt = null;
		
		try{
			stmt = dbConnection.createStatement();
			sql = "select ISBN, bookname, author, edition_b, shelf_ID from books";
			ResultSet rs = stmt.executeQuery(sql);
																																																																																																																																																																																			
			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column bookname
				int n = rs.getInt("ISBN");
				String bookname = rs.getString("bookname");
				String author = rs.getString("author");
				int edition = rs.getInt("edition_b");
				int shelf = rs.getInt("shelf_ID");
				
				if(n==id){
					bk.setbook_ID(n);
					bk.setName(bookname);
					bk.setauthor(author);
					bk.setedition(edition);
					bk.setshelf_ID(shelf);
					break;
				}
				// Add exception handling here if more than one row is returned
			}
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		// Add exception handling when there is no matching record
		return bk;
	}

	@Override
	public books getbookByName(String name) {
		books bk = new books();
		String sql;
		Statement stmt = null;
		
		try{
			stmt = dbConnection.createStatement();
			sql = "select ISBN, bookname, author, edition_b, shelf_ID from books";
			ResultSet rs = stmt.executeQuery(sql);
																																																																																																																																																																																			
			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column bookname
				int n = rs.getInt("ISBN");
				String bookname = rs.getString("bookname");
				String author = rs.getString("author");
				int edition = rs.getInt("edition_b");
				int shelf = rs.getInt("shelf_ID");

				if(name.equals(bookname)){
					bk.setbook_ID(n);
					bk.setName(bookname);
					bk.setauthor(author);
					bk.setedition(edition);
					bk.setshelf_ID(shelf);
					break;
				}
				// Add exception handling here if more than one row is returned
			}
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		// Add exception handling when there is no matching record
		return bk;
	}

	@Override
	public books getbookByAuthor(String author) {
		books bk = new books();
		String sql;
		Statement stmt = null;
		
		try{
			stmt = dbConnection.createStatement();
			sql = "select ISBN, bookname, author, edition_b, shelf_ID from books";
			ResultSet rs = stmt.executeQuery(sql);
																																																																																																																																																																																			
			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column bookname
				int n = rs.getInt("ISBN");
				String bookname = rs.getString("bookname");
				String a = rs.getString("author");
				int edition = rs.getInt("edition_b");
				int shelf = rs.getInt("shelf_ID");
				

				if(a.equals(author)){
					bk.setbook_ID(n);
					bk.setName(bookname);
					bk.setauthor(a);
					bk.setedition(edition);
					bk.setshelf_ID(shelf);	
					break;
				}
				// Add exception handling here if more than one row is returned
			}
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		// Add exception handling when there is no matching record
		return bk;
	}


	@Override
	public void addbook(books b,shelf s) {


		PreparedStatement preparedStatement2 = null;																																																																																																																																													
		String sql;
		sql = "insert into books(ISBN, bookname, author, edition_b, shelf_ID) values (?,?,?,?,?)";

		try {
			preparedStatement2 = dbConnection.prepareStatement(sql);
 
			preparedStatement2.setInt(1, b.getbook_ID());
			preparedStatement2.setString(2, b.getName());
			preparedStatement2.setString(3, b.getauthor());
			preparedStatement2.setInt(4, b.getedition());
			preparedStatement2.setInt(5, s.getshelfID());
 
			// execute insert SQL stetement
			preparedStatement2.executeUpdate();
 
			System.out.println("books: ISBN " + b.getbook_ID() 
				+ ", added to the database");
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}

		try{
			if (preparedStatement2 != null) {
				preparedStatement2.close();
			}
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}
	}

		@Override
	public void removebook(books b) {
		PreparedStatement preparedStatement = null;																																																																																																																																													
		String sql;
		sql = "DELETE FROM books WHERE bookname=?";

		try {
			preparedStatement = dbConnection.prepareStatement(sql);
 
			preparedStatement.setString(1, b.getName());
 
			// execute insert SQL stetement
			preparedStatement.executeUpdate();
 
			System.out.println("books: name " + b.getName() 
				+ ", deleted from the database");
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}

		try{
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}
	}
}
