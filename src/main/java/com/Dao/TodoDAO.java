package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class TodoDAO {
	
	private Connection conn;

	public TodoDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addTodo(String name,String todo,String status)
	{
		boolean f = false;
		try {
			String sql = "insert into todotable(name,todo,status) values (?,?,?)";
			
			PreparedStatement ps  = conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2, todo);
			ps.setString(3, status);
			
			
			int i = ps.executeUpdate();
			
			if(i==1)
			{
				f=false;
			}
			
		}catch(Exception e) {
		  e.printStackTrace();
		}
		return f;
		
	}

}
