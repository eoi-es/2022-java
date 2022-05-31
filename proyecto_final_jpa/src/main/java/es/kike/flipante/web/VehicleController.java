package es.kike.flipante.web;

import es.kike.flipante.data.entity.VehicleEntity;
import es.kike.flipante.service.PolicyService;
import es.kike.flipante.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VehicleController {

    private final VehicleService service;

    @Autowired
    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @GetMapping("/vehicles")
    public List<VehicleEntity> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public Optional<VehicleEntity> findById(@PathVariable("id") Integer id) {
        return this.service.findById(id);
    }

    @PostMapping("/vehicles")
    public VehicleEntity save(VehicleEntity entity) {
        return this.service.save(entity);
    }

    @PutMapping("/vehicles/{id}")
    public VehicleEntity update(@PathVariable("id") Integer id, VehicleEntity entity) {
        entity.setId(id);
        return this.service.update(entity);
    }

    @DeleteMapping("/vehicles/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        this.service.deleteById(id);
    }
}
