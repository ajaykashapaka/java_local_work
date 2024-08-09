import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Db1 {

	public static void main(String[] args) throws Exception
	{
		//load and register
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  // Establish connection between java application and db
	  Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
	  // create statement
	  Statement st=c.createStatement();
	  // write and excute Sql quary
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter table name");
	   String TABLENAME=sc.next();
	   st.executeUpdate("create table "+TABLENAME+"(id int,name varchar(60);  )" );
	  st.executeUpdate("insert into today values(1,'ajay')");
	  // close the connection 
	  c.close();
	  st.close();
	  System.out.println("Done");
	  
	}

}
