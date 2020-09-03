package com.mycompany.donnasalone.model;

import java.util.Date;

public class Register {
    int idRegister;
    Client client;
    Service service;
    Date dateRegister;
    
    
    public Register(){
        
    }

    public Register(Client client, Service service, Date dateRegister) {
        this.client = client;
        this.service = service;
        this.dateRegister = dateRegister;
    }

    public Client getClient() {
        return client;
    }

    public Service getService() {
        return service;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }
    
    
}
