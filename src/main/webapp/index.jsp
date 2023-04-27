<%@page import="com.DB.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html>
		<head>
		<meta charset="ISO-8859-1">
			<title>Insert title here</title>
			<%@include file="component/all_css.jsp" %>	
		</head>
	<body>
			<%@include file="component/navbar.jsp" %>
			<%-- <%
			Connection conn = DBConnect.getConn();
			out.println(conn);
			%> --%>
			
			<%
			String sucMsg = (String)session.getAttribute("sucMsg");
			if(sucMsg!=null)
			{%>
				<div class ="alert alert-success" role="alert"><%=sucMsg %></div>
			
			<%}
			session.removeAttribute("sucMsg");
			%>
			
			
			
			<%
			String failedMsg = (String)session.getAttribute("failedMsg");
			if(failedMsg!=null)
			{%>
				<div class ="alert alert-danger" role="alert"><%=failedMsg%></div>
			
			<%}
			session.removeAttribute("failedMsg");
			%>
			<h1 class="text-center text-success">TODOD_APP</h1>
			<div class = "container">
				<table class="table table-stripped" border = "1px">
					  <thead class = "bg-success text-white">
					    <tr>
					      <th scope="col">ID</th>
					      <th scope="col">Name</th>
					      <th scope="col">Todo</th>
					      <th scope="col">Status</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  <tbody>
					    <tr>
					      <th scope="row">1</th>
					      <th scope="row">Shubham</th>
					      <td>Java tutorial</td>
					      <td>Pending</td>
					      <td><a href = "" class = "btn btn-sm btn-succes">SAVE</a>
					      <a href = "" class = "btn btn-sm btn-danger">DELETE</a>
					    </tr>
					  </tbody>
					</table>
			</div>	


		
	</body>
</html>