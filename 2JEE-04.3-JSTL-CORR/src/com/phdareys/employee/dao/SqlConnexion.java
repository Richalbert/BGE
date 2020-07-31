package com.phdareys.employee.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SqlConnexion {

	public SqlConnexion() {
		try {
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/bge");
			Connection connect = dataSource.getConnection();
			System.out.println("Connect BD ok..."); 
		}
		catch (Exception e) { System.out.println("Connect BD nok...");
		} 
	}
}
