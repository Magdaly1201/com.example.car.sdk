package com.example.demo.car.sdk.service;

import java.util.Collection;
import org.springframework.stereotype.Service;
import com.example.demo.car.model.ICar;
import com.example.demo.car.model.ICarData;

@Service
public class CarService implements ICarService {

    @Override
    public ICar getById(int id) {
        return null;
    }

    @Override
    public ICar create(ICarData car) {
        return null;
    }

    @Override
    public ICar update(int id, ICarData car) {
        return null;
    }

    @Override
    public Collection<ICar> all() {
        return null;
    }

}
