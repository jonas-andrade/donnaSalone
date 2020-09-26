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
public class AddressTab extends AbstractTableModel {
    private final List<Address> list;
    private  String[] col  = {"Rua","Bairro","Municipio", "Estado","País"," Nacionalidade"}; 

    public AddressTab(List<Address> list) {
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
    public Object getValueAt(int l, int c){

        switch (c) {
                   case 0:
                       return list.get(l).street;
                   case 1:
                       return list.get(l).neighborhood;
                   case 2:
                       return list.get(l).county;
                   case 3:
                       return list.get(l).state;
                   case 4:
                       return list.get(l).country;
                   case 5:
                       return list.get(l).nationality;
                   default:
                       return null;
               }
        
    }
    
}
