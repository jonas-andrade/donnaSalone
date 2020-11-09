/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.dao;

import com.mycompany.donnasalone.model.Address;
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
public class AddressDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet result;
    
    
    public AddressDAO(Connection con){
        this.con = con;
        
    }
    
    
    public void createAddress(Address address) throws SQLException{
        stmt = con.prepareStatement("insert into address (street,neighborhood,county,state,country,nationality) values (?,?,?,?,?,?)");
        stmt.setString(1, address.getStreet());
        stmt.setString(2, address.getNeighborhood());
        stmt.setString(3, address.getCounty());
        stmt.setString(4, address.getState());
        stmt.setString(5, address.getCountry());
        stmt.setString(6, address.getNationality());
        stmt.execute();
        stmt.close();
        
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

    public void delete(String id) {
        
          try {
            
           
            
            stmt = con.prepareStatement("delete from address where street=?");
            stmt.setString(1, id);
            stmt.execute();
        } catch (SQLException ex) {
           System.err.print("erro de sql");
            
            
        }
        
    }

    public List<Address> getsearch(String texto,String atributo) {
        List<Address> listAddress  = new ArrayList<>();
        
        try {
            
            String sql = "select * from address where "+atributo+" like '"+texto+"%'";
            
            stmt = con.prepareStatement(sql);
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
            listAddress.add(address);

            
        }     
            
        } catch (SQLException ex) {
            System.out.print("erro de SQL: "+ex);
        }finally{
            System.out.println("jojojoj");
        }
     return listAddress; 
       
        
    }
    
    
    
    
    
}
