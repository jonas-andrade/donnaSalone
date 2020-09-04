/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll.helpers;

import com.mycompany.donnasalone.model.Admin;
import com.mycompany.donnasalone.view.AdminView;

/**
 *
 * @author jonas
 */
public class AdminHelper {

    private final AdminView view;
   

    public AdminHelper(AdminView view ) {
        this.view = view;
    }
    
    public Admin getAdminModel(){
       String nome =  view.getjTextField1().getText();
       String senha = view.getjPasswordField1().getText();
       return new Admin(nome,senha);
    }
    public void setAdminModel(String nome, String senha){
          view.getjTextField1().setText(nome);
          view.getjPasswordField1().setText(senha);
          
    }
      public void limpaAdminView(){
          view.getjTextField1().setText("");
          view.getjPasswordField1().setText("");
          
    }
    
    
    
}
