/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.controll.helpers.AddressHelper;
import com.mycompany.donnasalone.dao.AddressDAO;
import com.mycompany.donnasalone.dao.Conex;
import com.mycompany.donnasalone.model.Address;
import com.mycompany.donnasalone.view.AddressView;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class AddressController {
    private final AddressView view;
    private final AddressHelper helper;
    private final Connection con;

    public AddressController(AddressView view) {
        this.view = view;
        this.con = new Conex().getConnection();
        this.helper = new AddressHelper(view);
    }

    public void saveAddress()  {
        Address ad = helper.getAddress();
        AddressDAO dao = new AddressDAO(con);
        
        try {
            dao.createAddress(ad);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro ao tentar cadastrar endereço!!");
        }



    }

 
    
    
    
    
    
}
