/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll;

import com.mycompany.donnasalone.controll.helpers.ServiceHelper;
import com.mycompany.donnasalone.model.ServiceTab;
import com.mycompany.donnasalone.model.ClientTab;
import com.mycompany.donnasalone.model.AddressTab;

import com.mycompany.donnasalone.dao.ServiceDAO;
import com.mycompany.donnasalone.dao.ClientDAO;
import com.mycompany.donnasalone.dao.AddressDAO;

import com.mycompany.donnasalone.dao.Conex;

import com.mycompany.donnasalone.model.Client;
import com.mycompany.donnasalone.view.RegisterServiceView;

import com.mycompany.donnasalone.view.ServiceView;
import java.awt.Color;


import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author jonas
 */
public class ServiceController {

    private final ServiceView view;
    private final RegisterServiceView views;
    private final Connection con;
    
    

    public ServiceController(ServiceView view){
         this.view = view;
         this.views = new RegisterServiceView();
         this.con = new Conex().getConnection();
    }
    
   
    public void checked() throws SQLException {
        ServiceDAO sdao = new ServiceDAO(con);
        ClientDAO cdao = new ClientDAO(con);
      
        AddressDAO adao = new  AddressDAO(con);
        
        switch (view.getjComboBox1().getSelectedIndex()) {
            case 0:
                view.getjComboBox2().setEnabled(false);
                view.getjButtonClient().setEnabled(false);
                view.getjButtonservice().setEnabled(true);
                view.getjButtonDesc().setEnabled(true);
                view.getjButtonDesc().setVisible(true);


                
                ServiceTab serviceTab = new ServiceTab(sdao.readService());
                view.getjTDados().setModel(serviceTab);
                
                break;
            case 1:
                view.getjComboBox2().setEnabled(true);
                view.getjButtonClient().setEnabled(true);
                view.getjButtonservice().setEnabled(false);
                view.getjButtonDesc().setEnabled(false);
                view.getjButtonDesc().setVisible(false);
                

                ClientTab clientTab = new ClientTab(cdao.readClient());
                view.getjTDados().setModel(clientTab);
                break;
            case 2:
                view.getjComboBox2().setEnabled(false);
                view.getjButtonClient().setEnabled(false);
                view.getjButtonservice().setEnabled(false);
                view.getjButtonDesc().setEnabled(false);
                view.getjButtonDesc().setVisible(false);



                AddressTab addressTab = new AddressTab(adao.readAddress());
                view.getjTDados().setModel(addressTab);
                break;
            default:
                break;
        }
       
           
    
           
             
    
    }//end function//end function

    
    

    public void limpar() {
        view.getjComboBox2().setEnabled(false);
        
           view.getjTDados().setModel(new DefaultTableModel(
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

    public void combobox() throws SQLException {
        
        
            ClientDAO dao = new ClientDAO(con);
            
            
            for (Client c: dao.readClient()){
                
                view.getjComboBox2().addItem(c.getNomeClient());
                    
            }

        
        
    }

    public void comboboxEvent() throws SQLException {
        
        ClientDAO dao = new ClientDAO(con);
        
        for (int i=0;i<dao.readClient().size();i++){
        if(view.getjComboBox2().getSelectedIndex()== dao.readClient().get(i).getIdClient()){
            
                      
                       view.getjTDados().changeSelection((dao.readClient().get(i).getIdClient()), 0, false, true);
                        view.getjTDados().setSelectionBackground(Color.decode("#ffffff"));
                       view.getjTDados().setSelectionForeground(Color.decode("#000000"));
                       
            
        }
        
        }
        
        
    }

    public void desc(){
       
        if (view.getjTDados().getSelectedRow() <= view.getjTDados().getRowCount()&& view.getjTDados().getSelectedRow() >= 0){
            int selecionada = view.getjTDados().getSelectedRow();
            Object valor = view.getjTDados().getValueAt(selecionada, 3); 
             
              view.getMsggg().setVisible(true);
             
              view.getjTextPanepppp().setText("Descrição do Serviço Selecionado :  "+(String) valor+"         @donnaSalone_System");
           

        }else{
         System.out.println("nada selecionado");
         
              view.getMsggg().setVisible(true);
             
              view.getjTextPanepppp().setText("nada selecionado! ... por favor selecione o item desejado");
              
  
        }
       
        
         
        
          
    }

    public void out() {
            
              view.getMsggg().setVisible(false);
             
           
        
              
    }

    public void del() {
        int conf = JOptionPane.showConfirmDialog(null,"Deseja Remover Cliente?","...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION){
            
           if (view.getjTDados().getSelectedRow() <= view.getjTDados().getRowCount()&& view.getjTDados().getSelectedRow() >= 0){
            int selecionada = view.getjTDados().getSelectedRow();
            ServiceDAO dao = new ServiceDAO(con);
            String n = (String) view.getjTDados().getValueAt(selecionada, 0);
            dao.delete(n);
            ServiceView service = new ServiceView();
            
            service.setVisible(true);
   

        }else{
            System.out.println("nada selecionado p delete");
         
  
        } 
            
            
        }else{
            System.out.println("nada feito");
        }
        
    }

  
   
        
}




 