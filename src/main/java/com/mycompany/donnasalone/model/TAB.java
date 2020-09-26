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
public class TAB extends AbstractTableModel{
    List<Service> line;
    String[] col ;

    public TAB(List<Service> line,String[] col) {
        this.line = line;
        this.col=col;
    }
    

    @Override
    public int getRowCount() {
        return line.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public Object getValueAt(int line, int col) {
        
        switch(col){
            case 0:
                return this.line.get(line).nomeService;
            case 1:
                return this.line.get(line).precoService;
            case 2:
                return this.line.get(line).describeService;
             
                
                
        }
        return null;
        
    }

    @Override
    public String getColumnName(int column) {
        return this.col[column];
    }

  public void addRow(Service e){
      this.line.add(e);
      this.fireTableDataChanged();
      
  }

    
    
    
    
}
