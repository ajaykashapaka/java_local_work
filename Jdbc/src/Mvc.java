import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mvc {

	public static void main(String[] args) throws Exception
	{
		 //load and Register
		Class.forName("com.mysql.cj.jdbc.Driver");
		//  establish connection Betwen java application and database
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		//create statement
		Statement st=c.createStatement();
		 st.executeUpdate("insert into rajfrindslist values(1,'sunny'))");
		  c.close();
		  st.close();
		  System.out.println("int");
		  
	}

}
