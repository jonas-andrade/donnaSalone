/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.controll.helpers.AdminHelper;
import com.mycompany.donnasalone.model.Admin;
import com.mycompany.donnasalone.view.AdminView;

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
    
    public void cadastrar(){
      //pegar admin
      Admin admin = helper.getAdminModel();
      System.out.println("nome: "+admin.getNomeAdmin()+" senha: "+admin.getSenhaAdmin());
   
    }

    public void limar() {
        helper.limpaAdminView();

    }
    
    
}
