
import java.sql.*;
public class jdb1_a {

	public static void main(String[] args) {
		String ss="jdbc:mysql://localhost:3306/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root"))
		{
			
			Statement st=null;
			ResultSet rs=null;
			if(con!=null)
			{
System.out.println("Implementation class is\t"+con.getClass()); 
st=con.createStatement();
			}
			if(st!=null)
			{
				rs=st.executeQuery("select * from dept");
			}
			if(rs!=null)
			{
				while(rs.next())
				{
					int no=rs.getInt("deptno");
					String name=rs.getString("dname");
					String add=rs.getString("loc");
					System.out.println(no+"\t"+name+"\t"+add);
				}
			}

		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}
