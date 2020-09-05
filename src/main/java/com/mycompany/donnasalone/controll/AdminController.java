/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.controll.helpers.AdminHelper;
import com.mycompany.donnasalone.dao.AdminDAO;
import com.mycompany.donnasalone.dao.Conex;
import com.mycompany.donnasalone.model.Admin;
import com.mycompany.donnasalone.view.AdminView;
import com.mycompany.donnasalone.view.ServiceView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jonas
 */
public class AdminController {

    private final AdminView view;
    private final AdminHelper helper;
  
    public AdminController(AdminView view){
        this.view = view;
        this.helper = new AdminHelper(view);
        
    }
    
    public void enter() throws SQLException{
   
        Admin admm =  helper.getAdminModel();
        Connection cox =  new Conex().getConnection();
        AdminDAO admindao = new AdminDAO(cox);
        
        admindao.insert(admm);
      
    }

    public void limar() {
        helper.limpaAdminView();

    }
    
    
    
    
}
