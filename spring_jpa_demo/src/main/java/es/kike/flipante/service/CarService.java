package es.kike.flipante.service;

import es.kike.flipante.data.entity.CarEntity;

import java.util.List;

public interface CarService {

    CarEntity save(CarEntity entity);

    List<CarEntity> findAll();
}
