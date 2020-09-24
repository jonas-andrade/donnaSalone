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


/**
 *
 * @author jonas
 */
public class ServiceDAO {

    private final Connection connection;
    private PreparedStatement stmt;
    private ResultSet result;
    

    public ServiceDAO(Connection connection){
        this.connection = connection;
        
    }
 
    public List<Service> read() throws SQLException{
        
        stmt =  null;
         List<Service> listService  = new ArrayList<>();
         result = null;
        
        try {
            stmt = connection.prepareStatement("select * from service");
            
            result = stmt.executeQuery();
            
            while(result.next()){
                Service service = new Service();
                service.setIdService(result.getInt("idService"));
                service.setNomeService(result.getString("nomeService"));
                service.setPrecoService(result.getFloat("precoService"));
                service.setTypeService((char) result.getByte("typeService"));
                service.setDescribeService(result.getString("describeService")); 
                listService.add(service);
                
            }  
        } catch (SQLException ex) {
            System.out.print("erro de SQL: "+ex);
        }finally{
             stmt.close();
             result.close();
        }
      
     return listService;   
    }
    
    
    


    
}
