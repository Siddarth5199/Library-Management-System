import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class shelfDAO_JDBC implements shelfDAO {
																																																																																																																																																																																																																																															Connection dbConnection;

	public shelfDAO_JDBC(Connection dbconn){
		// JDBC driver bookname and database URL
 		//  Database credentials
		dbConnection = dbconn;
	}

	@Override
	public void addshelf(shelf s){
		PreparedStatement preparedStatement1 = null;																																																																																																																																													
		String sql1;
		sql1 = "insert into shelf(shelf_ID, snumber) values (?,?)";

		try {
			preparedStatement1 = dbConnection.prepareStatement(sql1);
 
			preparedStatement1.setInt(1,s.getshelfID() );
			preparedStatement1.setInt(2,s.getshelfN());
 
			// execute insert SQL stetement
			preparedStatement1.executeUpdate();
 
			System.out.println("shelf: id " + s.getshelfID() 
				+ ", added to the database");
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}

		try{
			if (preparedStatement1 != null) {
				preparedStatement1.close();
			}
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}
	}

	@Override
	public void removeshelf(shelf s){
		PreparedStatement preparedStatement1 = null;																																																																																																																																													
		String sql1;
		sql1 = "DELETE FROM shelf WHERE shelf_ID=?";

		try {
			preparedStatement1 = dbConnection.prepareStatement(sql1);
 
			preparedStatement1.setInt(1,s.getshelfID() );
 
			// execute insert SQL stetement
			preparedStatement1.executeUpdate();
 
			System.out.println("shelf: id " + s.getshelfID() 
				+ ", deleted from the database");
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}

		try{
			if (preparedStatement1 != null) {
				preparedStatement1.close();
			}
		} catch (SQLException e) {
 			System.out.println(e.getMessage());
 		}
	}
}