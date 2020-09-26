/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.dao.AddressDAO;
import com.mycompany.donnasalone.dao.ClientDAO;
import com.mycompany.donnasalone.dao.Conex;
import com.mycompany.donnasalone.dao.ServiceDAO;
import com.mycompany.donnasalone.model.TAB;

import com.mycompany.donnasalone.view.ServiceView;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;


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
        
        String[] col = {"nomme","sjspo","fps", "","idsos"}; 
            ServiceDAO sdao = new ServiceDAO(con);
           TAB dt = new TAB(sdao.readService(),col);

            for (int i=0;i < dt.getRowCount();i++){
                
                dt.addRow(
                sdao.readService().get(i)
                );
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




 