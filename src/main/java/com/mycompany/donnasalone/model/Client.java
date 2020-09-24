package com.mycompany.donnasalone.model;

import java.util.Date;

public class Client {
int idClient;
String nomeClient;
String sexoClient;
Date dataDeNascimento;

    public Client() {
    }

    public Client(String nomeClient, String sexoClient, Date dataDeNascimento) {
        this.nomeClient = nomeClient;
        this.sexoClient = sexoClient;
        this.dataDeNascimento = dataDeNascimento;
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

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

   


    
}
