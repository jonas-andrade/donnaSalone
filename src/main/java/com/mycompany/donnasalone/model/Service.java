package com.mycompany.donnasalone.model;

public class Service {
    int idService;
    String nomeService;
    String precoService;
    String typeService;
    String describeService;
public Service(){
    
}

    public Service(int idService, String nomeService, String precoService, String typeService, String describeService) {
        this.idService = idService;
        this.nomeService = nomeService;
        this.precoService = precoService;
        this.typeService = typeService;
        this.describeService = describeService;
    }

  

    

    public String getNomeService() {
        return nomeService;
    }

    public String getPrecoService() {
        return precoService;
    }

    public String getTypeService() {
        return typeService;
    }

    public String getDescribeService() {
        return describeService;
    }

    public void setNomeService(String nomeService) {
        this.nomeService = nomeService;
    }

    public void setPrecoService(String precoService) {
        this.precoService = precoService;
    }

    public void setTypeService(String typeService) {
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

    @Override
    public String toString() {
        return "Service{" + "idService=" + idService + ", nomeService=" + nomeService + ", precoService=" + precoService + ", typeService=" + typeService + ", describeService=" + describeService + '}';
    }

  
    
}
