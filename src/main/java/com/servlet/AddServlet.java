package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBConnect;
import com.Dao.TodoDAO;


@WebServlet("/add_todo")
public class AddServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username = req.getParameter("username");
		String todo = req.getParameter("todo");
		String status = req.getParameter("status");
		
		
		TodoDAO dao = new TodoDAO(DBConnect.getConn());
		boolean f = dao.addTodo(username,todo,status);
		
		HttpSession session = req.getSession();
		
		if(f) {
			session.setAttribute("sucMsg", "Todo Added Succesfully");
			resp.sendRedirect("index.jsp");
		}
		else {
			session.setAttribute("failedMsg", "Todo Added Failed");
			resp.sendRedirect("index.jsp");
		}
		
		//System.out.println(username+" "+todo+" " + status);
	}
	

}
