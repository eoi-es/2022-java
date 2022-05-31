package es.kike.flipante.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
public class VehicleEntity implements IEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 15)
    private String plate;

    @ManyToOne
    private PolicyEntity policy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public PolicyEntity getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyEntity policy) {
        this.policy = policy;
    }
}
