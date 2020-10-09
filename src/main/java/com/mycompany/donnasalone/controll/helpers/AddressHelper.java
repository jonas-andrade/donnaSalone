/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.donnasalone.controll.helpers;

import com.mycompany.donnasalone.model.Address;
import com.mycompany.donnasalone.view.AddressView;

/**
 *
 * @author jonas
 */
public class AddressHelper {
    
    private final AddressView view;

    public AddressHelper(AddressView view) {
        this.view = view;
    }
    
    public Address getAddress(){
    String street = view.getjTextFieldRua().getText();
    String neighborhood = view.getjTextFieldBairro().getText();
    String county = view.getjTextFieldCidade().getText();
    String state = view.getjTextFieldEstado().getText();
    String country = (String) view.getjComboBoxPais().getSelectedItem();
    
    String nationality =  view.getjLabelNascionalidade().getText();
     return new Address(street,neighborhood,county,state,country,nationality);
    }
    
    
    
    
    
    
    
}
