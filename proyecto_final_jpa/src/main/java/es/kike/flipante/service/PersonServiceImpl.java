package es.kike.flipante.service;

import es.kike.flipante.data.entity.PersonEntity;
import es.kike.flipante.data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends AbstractService<PersonEntity, Integer, PersonRepository> implements PersonService {

    @Autowired
    public PersonServiceImpl(PersonRepository repository) {
        super(repository);
    }
}
