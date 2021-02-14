package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTeste {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost/exemplo?useSSL=false";
			String user = "root";
			String password = "root";

			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			String primeiroNome = "Maria";
			String profissao = "Vendedora";
			String ultimoNome = "Cecília";
			int idade = 30;
			int id = 4;
			String sql = "insert into pessoa values (?,?,?,?,?);";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, ultimoNome);
			preparedStatement.setString(3, primeiroNome);
			preparedStatement.setInt(4, idade);
			preparedStatement.setString(5, profissao);
			preparedStatement.execute();

			statement.execute(sql);
			// 'desenvolvedor');";
			// String sql = "update pessoa set idade=23 where id=3;";
			// String sql = "delete from pessoa where id=3;";

//			String sql = "select * from pessoa";
//
//			ResultSet resultSet = statement.executeQuery(sql);
//
//			for (int i = 1; i < resultSet.getMetaData().getColumnCount(); i++) 
//				System.out.print(resultSet.getMetaData().getColumnName(i)+ " ");
//				System.out.println();
//			
//			
//			while (resultSet.next()) {
//				for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
//					System.out.print(resultSet.getString(i) + " ");
//				}
//				System.out.println();
//
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
