/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;


import com.mycompany.donnasalone.controll.helpers.RegisterHelper;
import com.mycompany.donnasalone.view.RegisterView;
import com.mycompany.donnasalone.dao.Conex;

import com.mycompany.donnasalone.dao.ClientDAO;
import com.mycompany.donnasalone.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class RegisterController {
    
    private final Connection con;
    private final  RegisterView view;
    private final RegisterHelper helper;

    public RegisterController(RegisterView view) {
        this.view = view;
        this.con = new Conex().getConnection();
        this.helper = new RegisterHelper(view);

    }

    public void createClient() throws SQLException {
        
        
        ClientDAO dao = new ClientDAO(con);
        Client client = helper.getClient();
        
       try{
        dao.create(client);
           JOptionPane.showMessageDialog(null, "cadastrado com sucesso!");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar cadastrar"+e);
       }
       
       
       
    }

   
    
    
    
    
    
    
    
    
    
}
