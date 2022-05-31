package es.kike.flipante.data.repository;

import es.kike.flipante.data.entity.HouseEntity;
import es.kike.flipante.data.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
}
