package com.day21;

// 新增 person

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPerson {
    public static void main(String[] args) throws ClassNotFoundException {
        String jdbcUrl = "jdbc:derby://localhost:1527/app";
        String username = "app";
        String password = "app";
        String sql = "insert into person(username, password, age) values(?, ?, ?)";
        //-----------------------------------------------------------------------------
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        try(Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);) {
            
            pstmt.setString(1, "Tom");
            pstmt.setString(2, "ttt");
            pstmt.setInt(3, 17);
            // 進行更新
            int rowcount = pstmt.executeUpdate(); 
            System.out.println("異動筆數: " + rowcount);
            
        } catch (Exception e) {
        }
    }
}
