package es.kike.flipante.data.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "POLICY")
public class PolicyEntity implements IEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date startingDate;
    @Column(nullable = false)
    private Date endingDate;

    @ManyToOne
    private PolicyTypeEntity type;

    @OneToMany(mappedBy = "policy")
    private Set<HouseEntity> houses;

    @OneToMany(mappedBy = "policy")
    private Set<VehicleEntity> vehicles;

    @ManyToMany
    @JoinTable(name = "policy_person", joinColumns = @JoinColumn(name = "policy_id"), inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<PersonEntity> persons;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public PolicyTypeEntity getType() {
        return type;
    }

    public void setType(PolicyTypeEntity type) {
        this.type = type;
    }

    public Set<HouseEntity> getHouses() {
        return houses;
    }

    public void setHouses(Set<HouseEntity> houses) {
        this.houses = houses;
    }

    public Set<VehicleEntity> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<VehicleEntity> vehicles) {
        this.vehicles = vehicles;
    }

    public Set<PersonEntity> getPersons() {
        return persons;
    }

    public void setPersons(Set<PersonEntity> persons) {
        this.persons = persons;
    }
}
