/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.controll.helpers.ServiceHelper;
import com.mycompany.donnasalone.dao.Conex;
import com.mycompany.donnasalone.dao.ServiceDAO;
import com.mycompany.donnasalone.model.Service;
import com.mycompany.donnasalone.view.RegisterServiceView;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author jonas
 */
public class RegisterServiceController {
    private final RegisterServiceView view;
    
    public RegisterServiceController(RegisterServiceView view){
        this.view = view;
    }
    
    public void addService(){
        
        ServiceHelper helper = new ServiceHelper(view);
        Service service = helper.getService();
        Connection connection = new Conex().getConnection();
        ServiceDAO dao = new ServiceDAO(connection);
        
        dao.createService(service);
        JOptionPane.showMessageDialog(view, "Serviço cadastrado com sucesso!");
    }
  
}
