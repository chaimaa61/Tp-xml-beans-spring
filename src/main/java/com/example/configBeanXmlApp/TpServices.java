package com.example.configBeanXmlApp;

import java.util.List;
import java.util.stream.Collectors;

public class TpServices implements ITpServices{
    List<TpEntity> entities;

    public List<TpEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<TpEntity> entities) {
        this.entities = entities;
    }

    @Override
    public TpEntity add(TpEntity tpentity) {
        entities.add(tpentity);
        return tpentity;
    }

    @Override
    public TpEntity update(TpEntity tpentity) {
        TpEntity oldEntity= findById(tpentity.getId());
        entities.stream()
                .filter(ele -> ele.getId()==oldEntity.getId())
                .forEach(ele1-> ele1.setName(tpentity.getName()));
        return tpentity;
    }

    @Override
    public TpEntity delete(TpEntity tpentity) {
        TpEntity oldEntity= findById(tpentity.getId());
        entities.remove(tpentity);
        return oldEntity;
    }

    @Override
    public List<TpEntity> findByName(String name) {
        return entities.stream().filter(ele -> ele.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<TpEntity> all() {
        return entities;
    }

    @Override
    public TpEntity findById(int id) {

        return entities.stream().filter(ele->ele.getId()==id).findFirst().orElseThrow(()->new RuntimeException("Tp not found"));
    }
}
