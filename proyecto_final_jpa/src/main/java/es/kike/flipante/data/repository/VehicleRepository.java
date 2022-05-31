package es.kike.flipante.data.repository;

import es.kike.flipante.data.entity.PolicyTypeEntity;
import es.kike.flipante.data.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Integer> {
}
