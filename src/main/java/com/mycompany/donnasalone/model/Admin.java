package com.mycompany.donnasalone.model;

public class Admin {
    
private String login;
private String pass;

public Admin(){
    
}

    public Admin(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


  
  

    



}
