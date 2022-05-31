package es.kike.flipante.data.repository;

import es.kike.flipante.data.entity.HouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<HouseEntity, Integer> {
}
