package es.kike.flipante.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BICYCLE")
public class BicycleEntity extends AbstractVehicle {

    private Integer wheelsNumber;

    public Integer getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(Integer wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }
}
