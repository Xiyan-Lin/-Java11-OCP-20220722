package com.day21;

// 刪除 person
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletePerson {
    public static void main(String[] args) throws ClassNotFoundException {
        String jdbcUrl = "jdbc:derby://localhost:1527/app";
        String username = "app";
        String password = "app";
        String sql = "delete from person where id=?";
        //-----------------------------------------------------------------------------
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        try(Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            
            pstmt.setInt(1, 5);
            // 進行更新
            int rowcount = pstmt.executeUpdate(); 
            System.out.println("異動筆數: " + rowcount);
            
        } catch (Exception e) {
        }
    }
}
