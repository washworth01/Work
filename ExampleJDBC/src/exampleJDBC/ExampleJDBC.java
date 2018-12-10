package exampleJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleJDBC 
{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";

	static final String USER = "root";
	static final String PASS = "root";

	public static void assessDB() 
	{
		try 
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database sakila");
		} catch (ClassNotFoundException e)
		{
			System.out.println("");
			e.printStackTrace();
		}

//		try 
//		{
//			conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//			// C
//			System.out.println("Inserting records into table actor");
//			stmt = conn.createStatement();
//
//			String sql = "INSERT INTO actor VALUES (201, 'Java', 'Man', '2006-02-15 04:34:33')";
//			stmt.executeUpdate(sql);
//			System.out.println("Inserted records into the table actor");
//
//			// R
//			System.out.println("Creating statement");
//			stmt = conn.createStatement();
//
//			String sq12 = "SELECT actor_id, first_name, last_name FROM actor";
//			ResultSet rs = stmt.executeQuery(sq12);
//
//			while (rs.next()) {
//				int id = rs.getInt("actor_id");
//				String firstName = rs.getString("first_name");
//				String lastName = rs.getString("last_name");
//
//				System.out.println("ID: " + id + ", first_name: " + firstName + ", last_name: " + lastName);
//			}
//
//			rs.close();
//
//			// U
//			System.out.println("Creating statement");
//			stmt = conn.createStatement();
//
//			String sql3 = "UPDATE actor " + "SET last_name = 'woman' WHERE actor_id in (201)";
//			stmt.executeUpdate(sql3);
//
//			// D
//			System.out.println("Creating statement");
//			stmt = conn.createStatement();
//
//			String sql4 = "DELETE FROM actor " + "WHERE actor_id = 201";
//			stmt.executeUpdate(sql4);
//
//		} 
//		catch (SQLException SQLException) 
//		{
//			System.out.println("SQLException: " + SQLException.getMessage());
//			System.out.println("SQLStates: " + SQLException.getSQLState());
//		}
	}
	
	public static void test()
	{
		Connection conn = null;
		Statement stmt =  null;
		
		try 
		{
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// C
			System.out.println("Inserting records into table actor");
			stmt = conn.createStatement();

			String sql = "INSERT INTO actor VALUES (201, 'Java', 'Man', '2006-02-15 04:34:33')";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table actor");

			// R
			System.out.println("Creating statement");
			stmt = conn.createStatement();

			String sq12 = "SELECT actor_id, first_name, last_name FROM actor";
			ResultSet rs = stmt.executeQuery(sq12);

			while (rs.next()) {
				int id = rs.getInt("actor_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");

				System.out.println("ID: " + id + ", first_name: " + firstName + ", last_name: " + lastName);
			}

			rs.close();

			// U
			System.out.println("Creating statement");
			stmt = conn.createStatement();

			String sql3 = "UPDATE actor " + "SET last_name = 'woman' WHERE actor_id in (201)";
			stmt.executeUpdate(sql3);

			// D
			System.out.println("Creating statement");
			stmt = conn.createStatement();

			String sql4 = "DELETE FROM actor " + "WHERE actor_id = 201";
			stmt.executeUpdate(sql4);

		} 
		catch (SQLException SQLException) 
		{
			System.out.println("SQLException: " + SQLException.getMessage());
			System.out.println("SQLStates: " + SQLException.getSQLState());
		}
	}

	public void create()
	{
		Connection conn = null;
		Statement stmt =  null;
		try 
		{
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Inserting records into table actor");
			stmt = conn.createStatement();

			String sql = "INSERT INTO actor VALUES (201, 'Java', 'Man', '2006-02-15 04:34:33')";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table actor");
		} 
		catch (SQLException SQLException) 
		{
			System.out.println("SQLException: " + SQLException.getMessage());
			System.out.println("SQLStates: " + SQLException.getSQLState());
		}
	}

	public static void read() 
	{
		Connection conn = null;
		Statement stmt =  null;
		try 
		{
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Creating statement");
			stmt = conn.createStatement();

			String sq12 = "SELECT actor_id, first_name, last_name FROM actor";
			ResultSet rs = stmt.executeQuery(sq12);

			while (rs.next()) {
				int id = rs.getInt("actor_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");

				System.out.println("ID: " + id + ", first_name: " + firstName + ", last_name: " + lastName);
			}

			rs.close();
		} 
		catch (SQLException SQLException)
		{
			System.out.println("SQLException: " + SQLException.getMessage());
			System.out.println("SQLStates: " + SQLException.getSQLState());
		}
	}
	
	public void update()
	{
		Connection conn = null;
		Statement stmt =  null;
		try 
		{
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Creating statement");
			stmt = conn.createStatement();

			String sql3 = "UPDATE actor " + "SET last_name = 'woman' WHERE actor_id in (201)";
			stmt.executeUpdate(sql3);
		} 
		catch (SQLException SQLException)
		{
			System.out.println("SQLException: " + SQLException.getMessage());
			System.out.println("SQLStates: " + SQLException.getSQLState());
		}
	}
	
	public void delete()
	{
		Connection conn = null;
		Statement stmt =  null;
		try 
		{
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Creating statement");
			stmt = conn.createStatement();

			String sql4 = "DELETE FROM actor " + "WHERE actor_id = 201";
			stmt.executeUpdate(sql4);
		} 
		catch (SQLException SQLException)
		{
			System.out.println("SQLException: " + SQLException.getMessage());
			System.out.println("SQLStates: " + SQLException.getSQLState());
		}
	}
}
