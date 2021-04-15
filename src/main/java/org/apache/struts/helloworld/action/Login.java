package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.Person; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends ActionSupport{
    
    private String username;
    private String password;
    private Person person = new Person(username, password);

    public String execute(){
        String ret = ERROR;
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://localhost:3306/cz3002";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "password");
            String sql = String.format("SELECT password FROM cz3002.person WHERE name='%s'", this.person.getUsername());
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
   
            while (rs.next()) {
               this.password = rs.getString(1);
               if (this.password != null && this.password.equals(this.person.getPassword())) {
                ret = SUCCESS;
            }
         
               
         }} catch (Exception e) {
            System.out.println(e);
         } finally {
            if (conn != null) {
               try {
                  conn.close();
               } catch (Exception e) {
                  System.out.println(e);
               }
            }
         }
         return ret;
      }

      public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    }

