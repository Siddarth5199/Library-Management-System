import java.lang.*;
import java.sql.*;
/*
	Methods to be called in the following order:

	1. activateConnection
	2. 	Any number getDAO calls with any number of database transactions
	3. deactivateConnection
*/
public class DAO_Factory{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	// Modify the DB_URL string, userid and password depending upon the database you want to connect to 
	// In the following string, you are connecting a adatabase named "daoproject"
	static final String DB_URL = "jdbc:mysql://localhost/librarydb";
	static final String USER = "root";
	static final String PASS = "Rohith99@";

	Connection dbconnection = null;

	// You can add additional DAOs here as needed. Generally one DAO per class
	shelfDAO shelfDAO = null;
	booksDAO booksDAO = null;
	borrowable_booksDAO bbooksDAO = null;


	boolean activeConnection = false;

	public DAO_Factory()
	{
		dbconnection = null;
		activeConnection = false;
	}

	public void activateConnection() throws Exception
	{
		if( activeConnection == true )
			throw new Exception("Connection already active");

		System.out.println("Connecting to database...");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			dbconnection = DriverManager.getConnection(DB_URL,USER,PASS);
			activeConnection = true;
		} catch(ClassNotFoundException ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

	public shelfDAO getshelfDAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( shelfDAO == null )
			shelfDAO = new shelfDAO_JDBC( dbconnection );

		return shelfDAO;
	}

	public booksDAO getbooksDAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( booksDAO == null )
			booksDAO = new booksDAO_JDBC( dbconnection );

		return booksDAO;
	}

	public borrowable_booksDAO getbbooksDAO() throws Exception
	{
		if( activeConnection == false )
			throw new Exception("Connection not activated...");

		if( bbooksDAO == null )
			bbooksDAO = new borrowable_booksDAO_JDBC( dbconnection );

		return bbooksDAO;
	}
	public void deactivateConnection()
	{
		// Okay to keep deactivating an already deactivated connection
		activeConnection = false;
		if( dbconnection != null ){
			try{
				dbconnection.close();
				dbconnection = null;
				booksDAO = null;
			}
			catch (SQLException ex) {
			    // handle any errors
			    System.out.println("SQLException: " + ex.getMessage());
			    System.out.println("SQLState: " + ex.getSQLState());
			    System.out.println("VendorError: " + ex.getErrorCode());
			}
		}
	}
};

