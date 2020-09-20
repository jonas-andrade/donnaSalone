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
    
    
    public void updatetable(){
        
        
        
              if (view.getjComboBox1().getSelectedIndex() == 0){
                  
               view.getjTable1().setModel(new DefaultTableModel(
                  new Object [][] {
                {"   Corte de cabelo", "  R$ 12,00", "      sale", "       bla bla"},
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
                "       Nome", "       Preço", "       TIpo", "        Descrição"
            }
                 ));  
                  
                  
            
        }else if (view.getjComboBox1().getSelectedIndex() == 1){
                
                 view.getjTable1().setModel(new DefaultTableModel(
                  new Object [][] {
                {"   Jose Antonio", "  joseM819@gmail.com", "      85991773278", "      03/12/1995", "      rua Barroso Costa fortaleza ceara"},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null}
            },
            new String [] {
                "       Nome", "       Email", "       Telefone", "        Nascimento", "        Endereço"
            }
                 ));  
                  
            
                 
                  
        }else if (view.getjComboBox1().getSelectedIndex() == 2){
                
                 view.getjTable1().setModel(new DefaultTableModel(
                  new Object [][] {
                {"   Gel MAN", "  R$ 25,00", "      MasterCard", "       5%"},
                {"   corte de cabelo", " R$ 12,00", "EloCard", " Não"},
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
                "       Produto", "       Preço", "       Cartão de Credito", "        Desconto"
            }
                 ));  
                  
                

        }else if (view.getjComboBox1().getSelectedIndex() == 3){
                
                 view.getjTable1().setModel(new DefaultTableModel(
                  new Object [][] {
                {"   Corte de cabelo", "  R$ 12,00", "      sale", "       bla bla"},
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
                  
                 
   
        }else if (view.getjComboBox1().getSelectedIndex() == 4){
                
                view.getjTable1().setModel(new DefaultTableModel(
                  new Object [][] {
                {"   Corte de cabelo", "  R$ 12,00", "      sale", "       bla bla"},
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

    public void reader() throws SQLException {
        
        
       if(view.getjComboBox1().getSelectedIndex() == 1) {
    DefaultTableModel table = (DefaultTableModel) view.getjTable1().getModel();
    
    ServiceDAO sdao = new ServiceDAO(con);
    Service service = null;
    
    for (Service s: sdao.read(service)){
        
        table.addRow(new Object[]{
            
            s.getNomeService(),
            s.getPrecoService(),
            s.getTypeService(),
            s.getDescribeService()
        
        
        
        });
        
    }// fim do for
        
       }else{
           System.out.println(" ele executado  evento não responde !!@@@");
       }  
       
    }
    
    
}
