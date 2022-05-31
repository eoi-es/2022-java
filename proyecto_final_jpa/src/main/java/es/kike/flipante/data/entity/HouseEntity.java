package es.kike.flipante.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "HOUSE")
public class HouseEntity implements IEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String address;

    @ManyToOne
    private PolicyEntity policy;

    @Override public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PolicyEntity getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyEntity policy) {
        this.policy = policy;
    }
}
