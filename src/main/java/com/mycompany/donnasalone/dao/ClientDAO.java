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
    private final SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
    
    public ClientDAO(Connection con){
        this.con =con;
        
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
            client.setDataDeNascimento(sm.format(result.getDate("dateClient")));
            
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
