package com.mycompany.donnasalone.model;

import java.util.Date;

public class Client {
int idClient;
String nomeClient;
char sexoClient;
Date dataDeNascimento;

    public Client() {
    }

    public Client(String nomeClient, char sexoClient, Date dataDeNascimento) {
        this.nomeClient = nomeClient;
        this.sexoClient = sexoClient;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomeClient() {
        return nomeClient;
    }

    public char getSexoClient() {
        return sexoClient;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setNomeClient(String nomeClient) {
        this.nomeClient = nomeClient;
    }

    public void setSexoClient(char sexoClient) {
        this.sexoClient = sexoClient;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


    
}
