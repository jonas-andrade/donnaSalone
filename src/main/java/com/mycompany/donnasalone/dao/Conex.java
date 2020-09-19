/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author jonas
 */
public class Conex {
    
  Connection con;
 public Connection getConnection(){
    try{
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/donnaSalone", "jonas_admin" , "admin");
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null," ocorreu um erro! :"+e);
        
    }    
    
    
    return con;
 }
    
}
