/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll.helpers;

import com.mycompany.donnasalone.model.Client;
import com.mycompany.donnasalone.view.RegisterView;

/**
 *
 * @author jonas
 */
public class RegisterHelper {
      private final RegisterView view;

    public RegisterHelper() {
        this.view = new RegisterView();
    }
      
    public Client getClient(){
        String name = view.getjTextFieldName().getText();
        String email = view.getjTextFieldEmail().getText();
        String nasc = view.getjTextFieldNascimento().getText();
        String tel = view.getjTextFieldTelephone().getText();
        String sexo = null;
        
        if (view.getjRadioButton1().isSelected()){
            sexo = "M";
        }else if (view.getjRadioButton2().isSelected()){
            sexo = "F";
        }
        return new Client(name,sexo,nasc,email,tel);
        
    
    }
    
    
}
