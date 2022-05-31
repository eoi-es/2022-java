package es.kike.flipante.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class CarEntity extends AbstractVehicle {

    private String plate;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
