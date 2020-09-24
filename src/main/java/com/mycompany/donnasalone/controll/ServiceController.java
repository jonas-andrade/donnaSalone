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

import com.mycompany.donnasalone.view.ServiceView;


import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


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
        DefaultTableModel viewModel = (DefaultTableModel) view.getjTable1().getModel();
         viewModel.setNumRows(0);
        
          if(view.getjComboBox1().getSelectedIndex() == 0){ // dados de Service
         
            
                 
       
             ServiceDAO dao = new ServiceDAO(con);
             int count = dao.readService().size();
               viewModel.setNumRows(0);
              
                for (int i=0;i<count;i++){
                    
                   viewModel.addRow(new Object[]{
                   
                   dao.readService().get(i).getNomeService(),
                   dao.readService().get(i).getPrecoService(),
                   dao.readService().get(i).getTypeService(),
                   dao.readService().get(i).getDescribeService(),
                   null,
                   null });  
           }// end-for
                 
           
           
             }else if(view.getjComboBox1().getSelectedIndex() == 1){ //  dados do Cliente
               
              ClientDAO cdao = new ClientDAO(con);
               viewModel.setNumRows(0);
               
                int ccount = cdao.readClient().size();
              
                for (int i=0;i<ccount;i++){
                    
                   viewModel.addRow(new Object[]{
                   
                   cdao.readClient().get(i).getNomeClient(),
                   cdao.readClient().get(i).getSexoClient(),
                   cdao.readClient().get(i).getDataDeNascimento(),
                   null,
                   null,
                   null }); 
                 
//              
                   
           }// end-for
                 
          
                 
             }else if (view.getjComboBox1().getSelectedIndex() == 2){
                 AddressDAO adao = new AddressDAO(con);
                 viewModel.setNumRows(0);
                 
                 for (int i = 0; i < adao.readAddress().size();i++){
                 
                 viewModel.addRow(new Object[]{
                        adao.readAddress().get(i).getStreet(),
                        adao.readAddress().get(i).getNeighborhood(),
                        adao.readAddress().get(i).getCounty(),
                        adao.readAddress().get(i).getState(),
                        adao.readAddress().get(i).getCountry(),
                        adao.readAddress().get(i).getNationality()
                     
                     
                 });
                 
                 
                 
             }
                 
                 
                 
             }
        
       
        
           
             
    }

    
    
/*
    public void limpar() {
        
           view.getjTable1().setModel(new DefaultTableModel(
                  new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "       Nome", "       Preço", "       Tipo", "        Descrição"
            }
                 ));  
        
    }
   
        
}

 */



    }