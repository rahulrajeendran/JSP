package stdreg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/upldrslt")
public class UploadR extends HttpServlet {
//	String url="jdbc:mysql://localhost:3306/clgrg";
//	String password="childofprophecy@7";
	
	
	
	public void service(HttpServletRequest req,HttpServletResponse res) {
		String rno=req.getParameter("rno");
		String phy=req.getParameter("phy");
		String che=req.getParameter("che");
		String mat=req.getParameter("mat");
		String gra=req.getParameter("gra");
		String ec=req.getParameter("ec");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/clgrg";
			String user = "root";
			String password = "childofprophecy@7";
//			Connection con=DriverManager.getConnection(url,"root", "childofprophecy@7");
			Connection con=DriverManager.getConnection(url,user,password);
//			Statement st=con.createStatement();
//			ResultSet rs=st.executeQuery("use clgrg");
			PreparedStatement ps=con.prepareStatement("insert into result(rollno,Engg_phy,Engg_che,Engg_math,Engg_grap,Electronics)values(?,?,?,?,?,?)");
			ps.setString(1, rno);
			ps.setString(2, phy);
			ps.setString(3, che);
			ps.setString(4, mat);
			ps.setString(5, gra);
			ps.setString(6, ec);
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
