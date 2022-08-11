package com.day21;

// 查詢 Person

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class QueryPerson {
    public static void main(String[] args) throws ClassNotFoundException {
        String jdbcUrl = "jdbc:derby://localhost:1527/app";
        String username = "app";
        String password = "app";
        String sql = "select id, username, password, age, createtime from person";
        //-----------------------------------------------------------------------------
        // 1. 載入驅動
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // 2. 建立 Connection, Statement, ResultSet
        try(Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            System.out.printf("%5s %5s %5s %5s %10s\n", "id", "name", "pwd", "age", "time");
            System.out.printf("-----------------------------------\n");
            // 資料結果會被放入到 rs 物件內
            // 顯示 rs 內的資料
            while (rs.next()) {                
                int id = rs.getInt("id");
                String uname = rs.getString("username");
                String pwd = rs.getString("password");
                int age = rs.getInt("age");
                Date createtime = rs.getDate("createtime");
                System.out.printf("%5d %5s %5s %5d %10s\n", id, uname, pwd, age, createtime);
            }
            
        } catch (Exception e) {
        }
        
    }
}
