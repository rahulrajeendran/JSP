package stdreg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Reg extends HttpServlet{
	
	String url="jdbc:mysql://localhost:3306/clgrg";
	String password="childofprophecy@7";
	
	public void service(HttpServletRequest req,HttpServletResponse res) {
		String rno=req.getParameter("rno");
		String name=req.getParameter("name");
		String fname=req.getParameter("fname");
		String gen=req.getParameter("gridRadios1");
		String crs=req.getParameter("crs");
		String branch=req.getParameter("branch");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,"root",password);
			PreparedStatement ps=con.prepareStatement("insert into Student(rollno,Name,father,gender,course,branch)values(?,?,?,?,?,?)");
			ps.setString(1, rno);
			ps.setString(2, name);
			ps.setString(3, fname);
			ps.setString(4, gen);
			ps.setString(5, crs);
			ps.setString(6, branch);
			ps.execute();
			System.out.println("uploaded");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
