package com.day21;

// 修改 person
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdatePerson {
    public static void main(String[] args) throws ClassNotFoundException {
        String jdbcUrl = "jdbc:derby://localhost:1527/app";
        String username = "app";
        String password = "app";
        String sql = "update person set password=?, age=? where id=?";
        //-----------------------------------------------------------------------------
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        try(Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            
            pstmt.setString(1, "abcd");
            pstmt.setInt(2, 25);
            pstmt.setInt(3, 5);
            // 進行更新
            int rowcount = pstmt.executeUpdate(); 
            System.out.println("異動筆數: " + rowcount);
            
        } catch (Exception e) {
        }
    }
}
