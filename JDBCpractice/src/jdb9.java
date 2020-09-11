import java.io.*;
import java.sql.*;
public class jdb9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		try {
			String name = "Vishal";
			String address = "Virar";
			String email = "vishal@g";
			String username = "VishalB96";
			String password = "qwerty";
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			
			conn = DriverManager.getConnection(url,"root","root");
			PreparedStatement pst = conn.prepareStatement("insert into person values (?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, address);
			pst.setString(3, email);
			pst.setString(4, username);
			pst.setString(5,password);
			int k = pst.executeUpdate();
			if(k>0)System.out.println("done");
			else System.out.println("notDone");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
