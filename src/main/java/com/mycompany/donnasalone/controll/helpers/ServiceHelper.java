/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll.helpers;
import com.mycompany.donnasalone.dao.ServiceDAO;
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
          String precoService = view.getjFormattedTextFieldPreco().getText();
    String typeService;
    switch(view.getjComboBoxTipo().getSelectedIndex()){
        case 0:
             typeService = "A"; 
            break;
        case 1:
             typeService = "B"; 
            break;
        case 2:
             typeService = "C"; 
            break;
        case 3:
             typeService = "D"; 
            break;
        default:
             typeService = "A";
             break;
                      
    }
           
    
    
    
    String describeService = view.getjTextAreaDescricao().getText();
    
     return new Service(idService,nomeService, precoService, typeService, describeService);
    }
    
}
