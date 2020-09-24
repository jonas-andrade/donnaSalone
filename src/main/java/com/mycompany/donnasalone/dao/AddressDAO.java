/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.dao;

import com.mycompany.donnasalone.model.Address;
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
public class AddressDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet result;
    
    
    public AddressDAO(Connection con){
        this.con = con;
        
    }
  
    public List<Address> readAddress() throws SQLException{
        List<Address> list = new ArrayList<>();
        try{
        stmt = con.prepareStatement("select * from address");
        result = stmt.executeQuery();
        
        
        while(result.next()){
            Address address =  new Address();
            address.setIdAddress(result.getInt("idAddress"));
            address.setStreet(result.getString("street"));
            address.setNeighborhood(result.getString("neighborhood"));
            address.setCounty(result.getString("county"));
            address.setState(result.getString("state"));
            address.setCountry(result.getString("country"));
            address.setNationality(result.getString("nationality"));
            list.add(address);

            
        }
        
        }catch(SQLException e){
               System.out.print("erro de SQL: "+e);
            
        }finally{
             stmt.close();
             result.close();
        }
        
        
        return list;
    }
    
    
    
    
    
}
