package es.kike.flipante.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PERSON")
public class PersonEntity implements IEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 255)
    private String name;
    private String surname;

    @ManyToMany(mappedBy = "persons")
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<PolicyEntity> getPolicies() {
        return policies;
    }

    public void setPolicies(Set<PolicyEntity> policies) {
        this.policies = policies;
    }
}
