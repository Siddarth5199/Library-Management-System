import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class issuelog_JDBC implements issue_logDAO {
																																																																																																																																																																																																																																															Connection dbConnection;

	public issuelog_JDBC(Connection dbconn){
		// JDBC driver name and database URL
 		//  Database credentials
		dbConnection = dbconn;
	}

	@Override
	public void getBookLogById(int id) 
	{
		issue_log s = new issue_log();
		String sql;
		Statement stmt = null;
		
		try{
			stmt = dbConnection.createStatement();
			sql = "select issue_id,book_id,date_issued,expected_return,return_date from issue_log where student_ID="+id ;
			ResultSet rs = stmt.executeQuery(sql);
																																																																																																																																																																																			
			//STEP 5: Extract data from result set
			while(rs.next()){
				//Retrieve by column name
				int issue_id  = rs.getInt("issue_id");
				int book_id = rs.getInt("book_id");
				// int student_ID = rs.getInt("student_ID");
				Date date_issued = rs.getDate("date_issued");
				Date expected_return = rs.getDate("expected_return");
				Date return_date = rs.getDate("return_date");
				System.out.println();
				System.out.println("issue_id: "+issue_id);
				System.out.println("book_id: "+book_id);
				System.out.println("date_issued: "+date_issued);
				System.out.println("expected_return: "+expected_return);
				System.out.println("return_date: "+return_date);
				// s.setRollno(rollno);
				// s.setName(name);
				// break;
				// Add exception handling here if more than one row is returned
			}
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		// Add exception handling when there is no matching record
	}
}
