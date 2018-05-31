package com.wyu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDAO {
	private static Connection conn;
	static  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("数据库驱动异常！");
			e.printStackTrace();
			}
		}
	
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://10.10.4.35:3306/library","root","123456");
		}catch (Exception e) {
			System.out.println("数据库连接失败！");
			e.printStackTrace();
			}
		return conn;
	}
	
	public static void clossAll(ResultSet rs,PreparedStatement ps,Connection coon) {
		if(rs != null) {
			try {
				rs.close();
			}catch (Exception e) {
				System.out.println("数据库关闭失败！");
				e.printStackTrace();
				}
		}
		if(ps != null) {
			try {
				ps.close();
			}catch (Exception e) {
				System.out.println("数据库关闭失败！");
				e.printStackTrace();
				}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch (Exception e) {
				System.out.println("数据库关闭失败！");
				e.printStackTrace();
				}
		}
	}
}
