package com.example.test2;
import java.sql.*;

public class MySqlConnect {
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "Wintermute";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    String query = "INSERT INTO test.test_app (sql_level, sql_index) \n" +
            "VALUES (@RequestParam(value = \"level\", defaultValue = \"0\") int level, @RequestParam (value = \"index\", defaultValue = \"0\") int index);";
    try
    {
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement();
        rs = stmt.executeUpdate(query);
    }
    catch (SQLException sqlEx) {
        sqlEx.printStackTrace();
    }
    finally {
        try { con.close(); } catch(SQLException se) {}
        try { stmt.close(); } catch(SQLException se) {}
        try { rs.close(); } catch(SQLException se) {}
    }
}
