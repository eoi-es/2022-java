package es.kike.flipante.service;

import es.kike.flipante.data.entity.PolicyTypeEntity;
import es.kike.flipante.data.repository.PolicyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyTypeServiceImpl extends AbstractService<PolicyTypeEntity, Integer, PolicyTypeRepository> implements PolicyTypeService {

    @Autowired
    public PolicyTypeServiceImpl(PolicyTypeRepository repository) {
        super(repository);
    }
}
