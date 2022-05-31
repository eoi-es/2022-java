package es.kike.flipante.data.repository;

import es.kike.flipante.data.entity.BicycleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicycleRepository extends JpaRepository<BicycleEntity, Integer> {
}
