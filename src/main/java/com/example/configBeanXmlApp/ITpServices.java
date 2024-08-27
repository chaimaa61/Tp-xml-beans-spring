package com.example.configBeanXmlApp;

import java.util.List;

public interface ITpServices {
    TpEntity add(TpEntity tpentity);
    TpEntity update(TpEntity tpentity);
    TpEntity delete(TpEntity tpentity);
    List<TpEntity> findByName(String name);
    List<TpEntity> all();
    TpEntity findById(int id);
}
