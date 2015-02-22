package ba.bitcamp.model;

import java.sql.*;

public class Application {
	protected static Connection db;

	/**
	 * tries to establish a database connection
	 * 
	 * @throws SQLException
	 *             if the connection is not successful
	 */
	public static void init(String databaseName) throws SQLException {
		db = DriverManager.getConnection("jdbc:sqlite:" + databaseName + ".db");
	}

	/**
	 * Tries to find a single result using the id column
	 * 
	 * @param id
	 *            if the model
	 * @param tableName
	 *            name of the table to search in
	 * @return a ResultSet collection
	 */
	protected static ResultSet find(int id, String tableName) {
		try {
			Statement stmt = db.createStatement();
			String sql = String.format("SELECT * FROM %s WHERE id = '%d' ;",
					tableName, id);
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.err.println("A Find: " + e.getMessage());
			return null;
		}

	}

	protected static int save(String tableName, String values) {
		Statement stmt = null;
		try {
			stmt = db.createStatement();
			String sql = String.format("INSERT INTO %s VALUES %s ;", tableName,
					values);
			stmt.execute("begin;");
			stmt.execute(sql);
			stmt.execute("commit;");
			sql = String.format("SELECT max(id) as last_id FROM %s; ",
					tableName);
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			if (stmt != null) {
				try {
					stmt.execute("rollback;");
				} catch (SQLException e1) {
					System.err.println(e1.getMessage());
					return -1;
				}
			}
			System.err.println(e.getMessage());
			return -1;
		}
	}

	// columnNames = name, suraname, *
	protected static ResultSet all(String tableName, String columnNames) {
		try {
			Statement stmt = db.createStatement();
			String sql = String.format("SELECT %s FROM %s;", columnNames,
					tableName);
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return null;
		}
	}

	protected static void update(String tableName, int id, String values) {
		try {
			Statement stmt = db.createStatement();
			String sql = String.format("UPDATE %s SET %s WHERE id = '%d';",
					tableName, values, id);
			stmt.execute(sql);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	protected static void delete(String tableName, int id){
		try {
			Statement stmt = db.createStatement();
			String sql = String.format("DELETE FROM %s WHERE id = '%d';", tableName, id);
			stmt.execute(sql);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
