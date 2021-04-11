package org.apache.struts.helloworld.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sqltest {
    
    public static void main(String[] args) {
        Connection conn = null;

        try{
            String URL = "jdbc:mysql://localhost:3306/cz3002?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "password");
            String sql = String.format("SELECT password FROM cz3002.person WHERE name='zoey'");
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getString(1));
             }
            
            }
         
        
        catch (Exception e) {
            System.out.println(e);
    }finally {
        if (conn != null) {
           try {
              conn.close();
           } catch (Exception e) {
           }
        }
     }}}

        

