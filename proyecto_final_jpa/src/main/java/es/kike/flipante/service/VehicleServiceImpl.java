package es.kike.flipante.service;

import es.kike.flipante.data.entity.VehicleEntity;
import es.kike.flipante.data.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl extends AbstractService<VehicleEntity, Integer, VehicleRepository> implements VehicleService {

    @Autowired
    public VehicleServiceImpl(VehicleRepository repository) {
        super(repository);
    }
}
