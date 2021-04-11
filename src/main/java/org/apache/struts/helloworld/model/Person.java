package org.apache.struts.helloworld.model;

public class Person {
    private String username;
    private String password;

    public Person(){};

    public Person(String name, String password){
        name = this.username;
        password = this.password;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
