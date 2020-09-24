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
    
    public void enter() throws SQLException {
        Connection cox = null;
        Admin admm;
        AdminDAO admindao;
        boolean select;
        
        try {
          cox = new Conex().getConnection();
          admm =  helper.getAdminModel();
          admindao = new AdminDAO(cox);
          select = admindao.readAdmin(admm);
            ServiceView service = new ServiceView();
          if(select){
              view.setVisible(false);
              service.setVisible(true);
              
          }else{
              view.showMesagem("login ou senha invalidas!\n Tente Novamente!");
          }
        } catch (SQLException ex) {
            view.showMesagem("erro ao select: "+ex);
           
        }finally{cox.close();}
     
        

    }

    public void limpar() {
        helper.limpaAdminView();
    }
    
    
    
    
}
