package tushar_jdbc_connectivity;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class abcd{
	public static void main(String Arg[]) throws Exception
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tushar","root","");
			Statement stmt=con.createStatement();			
			DataInputStream dis=new DataInputStream(System.in);
			
			System.out.println("Enter E");
			int e=Integer.parseInt(dis.readLine());
			
			System.out.println("Enter Name");
			String name1=dis.readLine();
			
			System.out.println("Enter Salary");
			int Salary1=Integer.parseInt(dis.readLine());
			
			String Q="insert into hell3 values("+e+",'"+name1+"',"+Salary1+")";
			System.out.println(Q);
			
			int i=stmt.executeUpdate(Q);
			System.out.println(i+"Record Added");
			
			con.close();
		}
		catch (Exception E)
		{
			System.out.println(E);
		}		
	}
}