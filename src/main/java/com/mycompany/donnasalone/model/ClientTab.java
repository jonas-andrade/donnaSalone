/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jonas
 */
public class ClientTab extends AbstractTableModel {

  
    private final  List<Client> list;
   
 
    private  String[] col= {"Nome","Sexo","Nascimento","E-mail","Telefone"};;
    

    public ClientTab(List<Client> list) {
        this.list = list;
        
        
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }
     @Override
    public String getColumnName(int column) {
        return this.col[column];
    }

    @Override
    public Object getValueAt(int l, int c) {
           switch (c) {
            case 0:
                return list.get(l).nomeClient;
            case 1:
                return list.get(l).sexoClient;
            case 2:
                return list.get(l).dataDeNascimento;
            case 3:
                return list.get(l).emailClient;
            case 4:
                return list.get(l).telephoneClient;
            default:
                return null;
        }
        
        
        
        
    }
    
}
