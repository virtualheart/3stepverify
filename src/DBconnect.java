import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import consents.consent;

/**
 *
 * @author smk
 */
public class DBconnect {
    	public Connection connect() {
            
		Connection con = null;
                consent c = new consent();
                
		String dbname = c.database;

		String url = "jdbc:mysql://localhost/" + dbname;
		String user = c.username;
		String pass = c.password;
		
		try {
			
			con = DriverManager.getConnection(url,user,pass);
			if(con!=null) {
				return con;
			} 
					
		} catch(Exception e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null,"Please Check Your Database");

		}
		
		return null;
	}
}
