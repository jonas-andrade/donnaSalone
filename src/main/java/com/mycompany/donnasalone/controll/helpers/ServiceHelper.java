/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll.helpers;

import com.mycompany.donnasalone.model.Service;
import com.mycompany.donnasalone.view.RegisterServiceView;



/**
 *
 * @author jonas
 */
public class ServiceHelper {
   
      private final RegisterServiceView view;

    public ServiceHelper(RegisterServiceView view) {
        this.view = view;
    }

 
    
    public Service getService(){
          
      
   
    String nomeService = view.getjTextFieldnome().getText();
    float precoService = Float.parseFloat(view.getjTextFieldpreco().getText());
    String typeService = view.getjTextFieldtipo().getText();
    String describeService = view.getjTextAreaDescricao().getText();
    
     return new Service(nomeService, precoService, typeService, describeService);
    }
    
}
