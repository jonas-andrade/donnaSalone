package com.mycompany.donnasalone.model;


public class Client {
    int idClient;
    String nomeClient;
    String sexoClient;
    String dataDeNascimento;
   
    String emailClient;
    String telephoneClient;
    

    public Client() {
    }

    public Client(int idClient, String nomeClient, String sexoClient, String dataDeNascimento, String emailClient, String telephoneClient) {
        this.idClient = idClient;
        this.nomeClient = nomeClient;
        this.sexoClient = sexoClient;
        this.dataDeNascimento = dataDeNascimento;
        this.emailClient = emailClient;
        this.telephoneClient = telephoneClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNomeClient() {
        return nomeClient;
    }

    public void setNomeClient(String nomeClient) {
        this.nomeClient = nomeClient;
    }

    public String getSexoClient() {
        return sexoClient;
    }

    public void setSexoClient(String sexoClient) {
        this.sexoClient = sexoClient;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }

    
   

 

   

   


    
}
