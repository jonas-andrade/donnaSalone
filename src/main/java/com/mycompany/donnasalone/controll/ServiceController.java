/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.model.ServiceTab;
import com.mycompany.donnasalone.model.ClientTab;
import com.mycompany.donnasalone.model.AddressTab;

import com.mycompany.donnasalone.dao.ServiceDAO;
import com.mycompany.donnasalone.dao.ClientDAO;
import com.mycompany.donnasalone.dao.AddressDAO;

import com.mycompany.donnasalone.dao.Conex;

import com.mycompany.donnasalone.view.ServiceView;


import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jonas
 */
public class ServiceController {

    private final ServiceView view;
    private final Connection con;
    
    

    public ServiceController(ServiceView view){
         this.view = view;
         this.con = new Conex().getConnection();
    }
    
   
    public void checked() throws SQLException {
        ServiceDAO sdao = new ServiceDAO(con);
        ClientDAO cdao = new ClientDAO(con);
        AddressDAO adao = new  AddressDAO(con);
        
        if (view.getjComboBox1().getSelectedIndex() == 0){
                     
                    ServiceTab serviceTab = new ServiceTab(sdao.readService());
                    view.getjTDados().setModel(serviceTab);

        }else if (view.getjComboBox1().getSelectedIndex() == 1){
                   
                    ClientTab clientTab = new ClientTab(cdao.readClient());
                    view.getjTDados().setModel(clientTab); 
        }else if (view.getjComboBox1().getSelectedIndex() == 2){
            
                   
                   AddressTab addressTab = new AddressTab(adao.readAddress());
                    view.getjTDados().setModel(addressTab);
        }
       
           
    
           
             
    
    }//end function//end function

    
    
//
//    public void limpar() {
//        
//           view.getjTable1().setModel(new DefaultTableModel(
//                  new Object [][] {
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}, 
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}
//            },
//            new String [] {
//                "       Nome", "       Preço", "       Tipo", "        Descrição"
//            }
//                 ));  
//        
//    }
//   
        
}




 