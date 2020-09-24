/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.dao.Conex;
import com.mycompany.donnasalone.dao.ServiceDAO;
import com.mycompany.donnasalone.model.Service;
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
        
          if(view.getjComboBox1().getSelectedIndex() == 0){
         
             try{ 
                 
       
             ServiceDAO dao = new ServiceDAO(con);
             int count = dao.read().size();
               viewModel.setNumRows(0);
              
                for (int i=0;i<count;i++){
                    
                   viewModel.addRow(new Object[]{
                   
                   dao.read().get(i).getNomeService(),
                   dao.read().get(i).getPrecoService(),
                   dao.read().get(i).getTypeService(),
                   dao.read().get(i).getDescribeService(),
                   null });  
           }// end-for
                 
            }catch(SQLException e){
                System.out.println("error update table: "+e);
            }finally{
            con.close();
           }
           
             }else if(view.getjComboBox1().getSelectedIndex() == 1){
               
                  try{ 
                 
       
             ServiceDAO dao = new ServiceDAO(con);
             int count = dao.read().size();
               viewModel.setNumRows(0);
              
                for (int i=0;i<count;i++){
                    
                   viewModel.addRow(new Object[]{
                   
                   dao.read().get(i).getNomeService(),
                   dao.read().get(i).getPrecoService(),
                   dao.read().get(i).getTypeService(),
                   dao.read().get(i).getDescribeService(),
                   null });  
           }// end-for
                 
            }catch(SQLException e){
                System.out.println("error update table: "+e);
            }finally{
            con.close();
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