package com.example.configBeanXmlApp;

import java.util.List;

public class TpController {
    private TpServices tpServices;

    public TpController(TpServices tpServices) {
        this.tpServices = tpServices;
    }

    public TpServices getTpServices() {
        return tpServices;
    }

    public void setTpServices(TpServices tpServices) {
        this.tpServices = tpServices;
    }
    public List<TpEntity> getAllTpEntities( TpEntity tpentity){
        this.tpServices.add(tpentity);
        return this.tpServices.all();
    }

}
