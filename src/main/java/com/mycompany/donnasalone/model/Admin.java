package com.mycompany.donnasalone.model;

import java.util.Date;

public class Admin {
int idAdmin;
String nomeAdmin;
char sexoAdmin;
Date dataDeNascimento;
public Admin(){
    
}

    public Admin(String nomeAdmin, char sexoAdmin, Date dataDeNascimento) {
        this.nomeAdmin = nomeAdmin;
        this.sexoAdmin = sexoAdmin;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public char getSexoAdmin() {
        return sexoAdmin;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public void setSexoAdmin(char sexoAdmin) {
        this.sexoAdmin = sexoAdmin;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    

}
