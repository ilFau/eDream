package dbcontact;
import java.sql.*;

public class ProvaJDBC {
	  public static void main (String args[]){
	    
	    try {
	      String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	      Class.forName(driver);
	      String url = "jdbc:odbc:mysql.netsons.com:3306";
	      Connection con = DriverManager.getConnection(
	    		  url, 
	    		  "kptjvfdg_edream", 
	    		  "MP15-16prog");
	      Statement cmd = con.createStatement();
	      String query = "SELECT * FROM Tratte";
	      ResultSet res = cmd.executeQuery(query);
	      while (res.next()) {
	        System.out.print(res.getString("Partenza"));
	        System.out.print(res.getString("Arrivo"));
	        System.out.println(res.getString("Distanza"));
	      }
	      res.close(); // chiudere le risorse DB è obbligatorio
	      cmd.close();
	      con.close();
	    }

	    catch (SQLException e){
	      e.printStackTrace();
	    }

	    catch (ClassNotFoundException e){
	      e.printStackTrace();
	    }
	  }
}
