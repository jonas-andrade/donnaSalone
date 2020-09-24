package com.mycompany.donnasalone.model;

public class Service {
    int idService;
    String nomeService;
    float precoService;
    char typeService;
    String describeService;
public Service(){
    
}

    public Service(int idService, String nomeService, float precoService, char typeService, String describeService) {
        this.idService = idService;
        this.nomeService = nomeService;
        this.precoService = precoService;
        this.typeService = typeService;
        this.describeService = describeService;
    }

    

    public String getNomeService() {
        return nomeService;
    }

    public float getPrecoService() {
        return precoService;
    }

    public char getTypeService() {
        return typeService;
    }

    public String getDescribeService() {
        return describeService;
    }

    public void setNomeService(String nomeService) {
        this.nomeService = nomeService;
    }

    public void setPrecoService(float precoService) {
        this.precoService = precoService;
    }

    public void setTypeService(char typeService) {
        this.typeService = typeService;
    }

    public void setDescribeService(String describeService) {
        this.describeService = describeService;
    }

  

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

  
    
}
