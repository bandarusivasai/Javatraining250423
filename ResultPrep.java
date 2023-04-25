package DataBaseConnector;
import java.sql.*;
import java.io.*;
public class ResultPrep {

	public static void main(String[] args) {
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3300/student","root","Sivasaikrishna");
		   PreparedStatement stmt = con.prepareStatement("insert into emp values(?,?,?)");
		   
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   do {
			   System.out.println("enter id:");
			   int id = Integer.parseInt(br.readLine());
			   System.out.println("Enter Name:");
			   String name = br.readLine();
			   System.out.println("Enter Salary:");
			   float salary = Float.parseFloat(br.readLine());
			   
			   stmt.setInt(1,id);
			   stmt.setString(2, name);
			   stmt.setFloat(3,salary);
			   int i = stmt.executeUpdate();
			   System.out.println(i+" records affected");
			   System.out.println("Do you want to continue: y/n");
			   String s = br.readLine();
			   if(s.startsWith("n")) {
				   break;
			   }
		   }
		   while(true);
		   con.close();
	   }catch(Exception e) {
		   System.out.println(e);
	   }
		

	}

}
