/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.dao;

import com.mycompany.donnasalone.model.Client;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author jonas
 */
public class ClientDAO {
   private final Connection con;
    private PreparedStatement stmt;
    private ResultSet result;
    
    
    public ClientDAO(Connection con){
        this.con =con;
        
    }
    
   public void create(Client client) throws SQLException{
 
       stmt = con.prepareStatement("insert into client(nomeClient,emailClient,telephoneClient,dateClient,sexoClient)values (?,?,?,?,?)");
       stmt.setString(0, client.getNomeClient());
       stmt.setString(1, client.getEmailClient());
       stmt.setString(2, client.getTelephoneClient());
       stmt.setString(3, client.getDataDeNascimento());
       stmt.setString(4, client.getSexoClient());
       stmt.execute();
       stmt.close();
   }
    
    
    
    
    
    
    public List<Client> readClient() throws SQLException{
           List<Client> list = new ArrayList<>();
        try{
        stmt = con.prepareStatement("select * from client");
        result = stmt.executeQuery();
       
        while(result.next()){
            Client client = new Client();
            client.setIdClient(result.getInt("idClient"));
            client.setNomeClient(result.getString("nomeClient"));
            client.setSexoClient(result.getString("sexoClient"));
            client.setDataDeNascimento(result.getString("dateClient"));
            client.setEmailClient(result.getString("emailClient"));
            client.setTelephoneClient(result.getString("telephoneClient"));
            
            list.add(client);
            
            
        }
        } catch (SQLException ex) {
            System.out.print("erro de SQL: "+ex);
        }finally{
             stmt.close();
             result.close();
        }
      
        
        return list;
    }

  
    
    
}
