package es.kike.flipante.service;

import es.kike.flipante.data.entity.CarEntity;
import es.kike.flipante.data.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarEntity save(CarEntity entity) {
        if (entity.getId() != null) {
            throw new RuntimeException("The id has to be null, due to it is autoincremental");
        }
        return this.carRepository.save(entity);
    }

    public List<CarEntity> findAll() {
        return this.carRepository.findAll();
    }
}
