/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.dao;

import com.mycompany.donnasalone.model.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jonas
 */
public class ServiceDAO {

    private final Connection connection;

    public ServiceDAO(Connection connection){
        this.connection = connection;
        
    }
 
    public List<Service> read(Service service) throws SQLException{
        String sql = "select * from service";
        PreparedStatement stmt =  null;
         List<Service> listService  = new ArrayList<>();
         ResultSet result = null;
        
        try {
            stmt = connection.prepareStatement(sql);
            
            result = stmt.executeQuery();
            
            while(result.next()){
                service.setIdService(result.getInt("idService"));
                service.setNomeService(result.getString("nomeService"));
                service.setPrecoService(result.getFloat("precoService"));
                service.setTypeService((char) result.getByte("typeService"));
                service.setDescribeService(result.getString("describeService")); 
                listService.add(service);
                
            }  
        } catch (SQLException ex) {
            Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            connection.close();
         
            
        }
      
     return listService;   
    }
    
    
    


    
}
