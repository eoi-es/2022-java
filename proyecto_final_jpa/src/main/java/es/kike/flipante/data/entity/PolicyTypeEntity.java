package es.kike.flipante.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "POLICY_TYPE")
public class PolicyTypeEntity implements IEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 10)
    private String name;

    @OneToMany(mappedBy = "type", fetch = FetchType.LAZY)
    private Set<PolicyEntity> policies;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PolicyEntity> getPolicies() {
        return policies;
    }

    public void setPolicies(Set<PolicyEntity> policies) {
        this.policies = policies;
    }
}
