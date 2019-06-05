package engine.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DBServices 
{

	/**
	 * This method will establish a connection to the database and execute the
	 * supplied query to return the results
	 * 
	 * @param sql
	 * @return rows of the SQL table as a list of map
	 * @author chirag	
	 */
	
	    private static String userName;
	    private static String password;
	    private static String dbURL;
	    private static Connection connection;
	    
	public ArrayList<HashMap<String, String>> executeQuery(String sql){
		try {
			userName = "postgres";
			password = "cx6ac54nmgGtLD1y";
			dbURL = "jdbc:postgresql://db.talentify.in:5432/sales?SCHEMA=public";
			try {
				Class.forName("org.postgresql.Driver");
			}
	                catch (ClassNotFoundException e) {
				System.out.println("postgresql JDBC driver not found.");
				e.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(dbURL, userName, password);
				Statement st = connection.createStatement();
				String sqlStr = "select analytics from task where id = 17949830";
				ResultSet rs = st.executeQuery(sqlStr);
				while (rs.next()) {
					System.out.println(rs.getString("analytics"));
				}
					
				} catch (SQLException e) {
					System.out.println("Connection to postgresql db failed");
				 e.printStackTrace();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
		}
	public static void main(String[] args) {
 		DBServices dbServices = new DBServices();
		dbServices.executeQuery("select * from role");
	}
	}