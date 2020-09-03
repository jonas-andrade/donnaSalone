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

    public String getStreet() {
        return street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCounty() {
        return county;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    

    
}
