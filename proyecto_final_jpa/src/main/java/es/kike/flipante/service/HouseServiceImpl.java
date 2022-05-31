package es.kike.flipante.service;

import es.kike.flipante.data.entity.HouseEntity;
import es.kike.flipante.data.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl extends AbstractService<HouseEntity, Integer, HouseRepository> implements HouseService {

    @Autowired
    public HouseServiceImpl(HouseRepository repository) {
        super(repository);
    }
}
