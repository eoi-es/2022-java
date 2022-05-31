package es.kike.flipante.service;

import es.kike.flipante.data.entity.IEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends IEntity<ID>, ID, R extends JpaRepository<E, ID>> implements IService<E, ID> {

    private final R repository;

    public AbstractService(R repository) {
        this.repository = repository;
    }

    public E save(E e) {
        if (e.getId() != null) {
            throw new IllegalArgumentException(String.format("Id %d has to be null", e.getId()));
        }
        return this.repository.save(e);
    }

    public E update(E e) {
        if (e.getId() == null) {
            throw new IllegalArgumentException(String.format("Id %d can't null", e.getId()));
        }
        return this.repository.save(e);
    }

    public List<E> findAll() {
        return this.repository.findAll();
    }

    public Optional<E> findById(ID id) {
        return this.repository.findById(id);
    }

    public void deleteById(ID id) {
        this.repository.deleteById(id);
    }

    R getRepository() {
        return this.repository;
    }

}
