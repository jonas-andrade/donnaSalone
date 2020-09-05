/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.dao;

import com.mycompany.donnasalone.model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author jonas
 */
public class AdminDAO {
    private final Connection connection;

    public AdminDAO(Connection connection) {
        this.connection = connection;
    }

 public void insert(Admin admin) throws SQLException{
    
     String sql = "insert into donnaSalone (user,pass) values('"+admin.getNomeAdmin()+"','"+admin.getSenhaAdmin()+"')"; 
     
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        
        connection.close();
     
     
     
 }
   
   
   
   
    
}
