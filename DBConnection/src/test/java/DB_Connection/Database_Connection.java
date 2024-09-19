package DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Connection
{
        public static void main(String[] args) throws Exception
        {
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/pract","root","rinki@sql");
		if(con.isClosed())
		{
			System.out.println("not connected");
		}
		else
		{
			System.out.println("connected");
		}
			
		   Statement sm=con.createStatement();
		     ResultSet r= sm.executeQuery("select *from Stt");
		     while(r.next())
		     {
		    	System.out.println(r.getInt(3)+":"+r.getInt(4));
		     }
		}
}
