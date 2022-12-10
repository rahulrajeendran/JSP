package stdreg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class Verify extends HttpServlet{
	String url="jdbc:mysql://localhost:3306/clgrg";
	String password="childofprophecy@7";
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,"root",password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Admin");
			rs.next();
			if(name.equals(rs.getString(1))&&pass.equals(rs.getString(2))) {
				res.sendRedirect("Register.html");
				System.out.println("Done");
			}
			else {
				res.sendRedirect("Admin.html");
				System.out.println("not done");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
