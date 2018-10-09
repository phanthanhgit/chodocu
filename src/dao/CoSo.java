package dao;

import java.sql.*;

public class CoSo {
	
	Connection cnn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public void KetNoi() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String dbURL = "jdbc:sqlserver://localhost:1433;user=sa;password=123;databaseName=QlSach";
		System.out.println("Chuẩn bị kết nối...");
		cnn = DriverManager.getConnection(dbURL);
		System.out.println("... Đã kết nối OK!");
	}
	
	public ResultSet getBang(String tb) throws Exception {
		stmt = cnn.createStatement();
		String Query = "Select * from " + tb;
		rs = stmt.executeQuery(Query);
		return rs;
	}
	
	public void DongKetNoi() throws Exception {
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(cnn != null) cnn.close();
		System.out.println("... Đã đóng kết nối!");
	}
}
