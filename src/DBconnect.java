
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author smk
 */
public class DBconnect {
    	public Connection connect() {
			
		Connection con = null;
		String dbname = "security";

		String url = "jdbc:mysql://localhost/" + dbname;
		String user = "smk";
		String pass = "";
		
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			if(con!=null) {
				return con;
			} 
					
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
