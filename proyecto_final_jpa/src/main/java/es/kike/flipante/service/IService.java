package es.kike.flipante.service;

import java.util.List;
import java.util.Optional;

public interface IService<E, ID> {

    E save(E e);

    E update(E e);

    List<E> findAll();

    Optional<E> findById(ID id);

    void deleteById(ID id);

}
