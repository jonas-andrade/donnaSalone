/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.dao;

import com.mycompany.donnasalone.model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



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
    
     String sql = "insert into admin (login,pass) values(?,?)"; 
     
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, admin.getLogin());
        stmt.setString(2, admin.getPass());

        stmt.execute();
         
 }
   
 public boolean select(Admin admin) throws SQLException{
     
     String sql = "select * from admin where login=? and pass=?";
     PreparedStatement stmt = connection.prepareStatement(sql);
     stmt.setString(1,admin.getLogin());
     stmt.setString(2, admin.getPass());
     stmt.execute();
    
    return stmt.getResultSet().next(); 
 } 
   
   
    
}
