package com.mycompany.donnasalone.model;

public class Address {
    int idAddress;
    String street;
    String neighborhood;
    String county;
    String state;
    String country;
    String nationality;
    
    
    public Address(){
        
    }

    public Address(String street, String neighborhood, String county, String state, String country, String nationality) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.county = county;
        this.state = state;
        this.country = country;
        this.nationality = nationality;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

  


    
}
