package com.example.demo.car.sdk.service;

import java.util.Collection;
import com.example.demo.car.model.ICar;
import com.example.demo.car.model.ICarData;

/**
 * 
 * @author mxs690
 *
 */
public interface ICarService {

    /**
     * 
     * @param id
     * @return ICar
     */
    public ICar getById(int id);

    public ICar create(ICarData car);

    public ICar update(int id, ICarData car);

    public Collection<ICar> all();
}
