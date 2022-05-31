package es.kike.flipante.service;

import es.kike.flipante.data.entity.PolicyEntity;
import es.kike.flipante.data.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl extends AbstractService<PolicyEntity, Integer, PolicyRepository> implements PolicyService {

    @Autowired
    public PolicyServiceImpl(PolicyRepository repository) {
        super(repository);
    }
}
