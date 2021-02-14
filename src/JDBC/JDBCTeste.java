package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTeste {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/exemplo", "root", "root");
			Statement statement = connection.createStatement();
			//String sql = "insert into pessoa values (3, 'Gonsalves', 'Alex', 22, 'desenvolvedor');";
			//String sql = "update pessoa set idade=23 where id=3;";
			String sql = "delete pessoa where id=3;";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
