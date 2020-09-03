package com.mycompany.donnasalone.model;

public class Contact {
    int idContact;
    String email;
    String telephone;
    
    
    public Contact(){
        
    }

    public Contact(String email, String telephone) {
        this.email = email;
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
}
