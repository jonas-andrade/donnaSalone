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
    private PreparedStatement stmt;
    private ResultSet result;
    

    public ServiceDAO(Connection connection){
        this.connection = connection;
        
    }
 
    public void createService(Service service){
        try {
            String sql = "insert into service (idService,nomeService,precoService,typeService,describeService) values (?,?,?,?,?)";
            
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, service.getIdService());
            stmt.setString(2,service.getNomeService());
            stmt.setString(3,service.getPrecoService());
            stmt.setString(4, service.getTypeService());
            stmt.setString(5, service.getDescribeService());
            stmt.execute();
        } catch (SQLException ex) {
           
            try {
                Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex);
                stmt.close();
            } catch (SQLException ex1) {
                Logger.getLogger(ServiceDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }


                
    }
    public List<Service> readService() throws SQLException{
      
         List<Service> listService  = new ArrayList<>();
         
        
        try {
            stmt = connection.prepareStatement("select * from service");
            
            result = stmt.executeQuery();
            
            while(result.next()){
                Service service = new Service();
                service.setIdService(result.getInt("idService"));
                service.setNomeService(result.getString("nomeService"));
                service.setPrecoService(result.getString("precoService"));
                service.setTypeService(result.getString("typeService"));
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
    public void delete(String id){
        try {
            
           
            
            stmt = connection.prepareStatement("delete from service where nomeService=?");
            stmt.setString(1, id);
           result =  stmt.executeQuery();
           
        } catch (SQLException ex) {
           System.err.print("erro de sql");
            
            
        }
        
        
    }

    public List<Service> getsearch(String texto) {
        
        List<Service> listService  = new ArrayList<>();
        
        try {
            
            String sql = "select * from service where nomeService like '"+texto+"%'";
            
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
             while(result.next()){
                Service service = new Service();
                service.setIdService(result.getInt("idService"));
                service.setNomeService(result.getString("nomeService"));
                service.setPrecoService(result.getString("precoService"));
                service.setTypeService(result.getString("typeService"));
                service.setDescribeService(result.getString("describeService")); 
                listService.add(service);
                
            }  
        } catch (SQLException ex) {
            System.out.print("erro de SQL: "+ex);
        }finally{
            System.out.println("jojojoj");
        }
     return listService; 
        
    }
    
    
    


    
}
