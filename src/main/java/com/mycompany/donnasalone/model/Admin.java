package com.mycompany.donnasalone.model;

public class Admin {
    
String nomeAdmin;
String senhaAdmin;

public Admin(){
    
}

    public Admin(String nomeAdmin, String senhaAdmin) {
        this.nomeAdmin = nomeAdmin;
        this.senhaAdmin = senhaAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public String getSenhaAdmin() {
        return senhaAdmin;
    }

    public void setSenhaAdmin(String senhaAdmin) {
        this.senhaAdmin = senhaAdmin;
    }

  

    



}
