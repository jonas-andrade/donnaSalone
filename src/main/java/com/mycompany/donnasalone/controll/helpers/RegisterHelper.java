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
      private final  RegisterView view;

 
    public RegisterHelper(RegisterView view) {
       this.view = view;
                
    }
      
    public Client getClient(){
        String sexo = null;
        if(view.getjRadioButton1().isSelected()){
            sexo = "M";
        }else if(view.getjRadioButton2().isSelected()){
            sexo = "F";
        }
       
       return new Client(view.getjTextFieldName().getText(),
                          sexo,
                          view.getjTextField1Nascimento().getText(),
                          view.getjTextFieldEmail().getText(),
                          view.getjTextFieldTelephone().getText());
       
     
        
    
    }
    
    
}
