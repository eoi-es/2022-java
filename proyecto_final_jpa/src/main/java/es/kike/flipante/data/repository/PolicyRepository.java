package es.kike.flipante.data.repository;

import es.kike.flipante.data.entity.PolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<PolicyEntity, Integer> {
}
