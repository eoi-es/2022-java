package es.kike.flipante.data.repository;

import es.kike.flipante.data.entity.PolicyEntity;
import es.kike.flipante.data.entity.PolicyTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyTypeRepository extends JpaRepository<PolicyTypeEntity, Integer> {
}
