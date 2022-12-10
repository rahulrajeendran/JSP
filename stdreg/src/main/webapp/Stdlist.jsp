<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-grad-school.css">
    <link rel="stylesheet" href="assets/css/owl.css">
    <link rel="stylesheet" href="assets/css/lightbox.css">
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900" rel="stylesheet">
<title>Insert title here</title>
</head>
<body style="background-image: url(pexels-suzy-hazelwood-1122865.jpg); background-size: 100%; background-repeat: no-repeat;">
  <div class="row" style="height: 150px;">
        <header class="main-header clearfix" role="header">
            <div class="logo">
              <a href="#"><em>K T</em> ഉ</a>
            </div>
            <a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
            <nav id="menu" class="main-nav" role="navigation">
              <ul class="main-menu">
                <li><a href="Home.html">Home</a></li>
             
                <li><a href="#section4">Student</a></li>
                <!-- <li><a href="#section5">Video</a></li> -->
                <li><a href="#section6">Admin</a></li>
              </ul>
            </nav>
         </header>
   </div>
   <div class="row">
        <div class="col-sm-2"></div>
        <div class="col">
            <div class="card ">
                <div class="card-header">
                  <ul class="nav nav-tabs card-header-tabs">
                    <li class="nav-item">
                      <a class="nav-link " href="Register.html">Add new student</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="Mark.html">Add new result</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="#">Registered Students</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Marklst.jsp">All student result</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Admin.html">Log out</a>
                    </li>
                  </ul>
                </div>
                <div class="card-body" style="background-image: url(pexels-pixabay-267885.jpg);background-size: 100%;">
                    <%
                    String url="jdbc:mysql://localhost:3306/clgrg";
                	String password="childofprophecy@7";
                	Class.forName("com.mysql.jdbc.Driver");
                	Connection con=DriverManager.getConnection(url,"root",password);
                	Statement st=con.createStatement();
            		ResultSet rs= st.executeQuery("select * from Student");
                    %>
                    <table style="width:100%; border: 2px solid white">
                    <tr>
                    <th>Course name</th>
                    <th>Branch name</th>
                    <th>Roll num</th>
                    <th>Name</th>
                    <th>Father name</th>
                    <th>Gender</th>
                    </tr>
                    <%
                    while(rs.next()) {
                    %>
                    <tr>
                    <td><%=rs.getString(5) %></td>
                    <td><%=rs.getString(6) %></td>
                    <td><%=rs.getString(1) %></td>
                    <td><%=rs.getString(2) %></td>
                    <td><%=rs.getString(3) %></td>
                    <td><%=rs.getString(4) %></td>
                    </tr>
                    <%} %>
                    </table>
                </div>
            </div>
        </div>
        <div class="col-sm-2"></div>
    </div>
</body>
</html>