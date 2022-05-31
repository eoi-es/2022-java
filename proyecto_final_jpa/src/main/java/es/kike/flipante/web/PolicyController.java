package es.kike.flipante.web;

import es.kike.flipante.data.entity.PolicyEntity;
import es.kike.flipante.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PolicyController {

    private final PolicyService service;

    @Autowired
    public PolicyController(PolicyService service) {
        this.service = service;
    }

    @GetMapping("/policies")
    public List<PolicyEntity> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/policies/{id}")
    public Optional<PolicyEntity> findById(@PathVariable("id") Integer id) {
        return this.service.findById(id);
    }

    @PostMapping("/policies")
    public PolicyEntity save(PolicyEntity entity) {
        return this.service.save(entity);
    }

    @PutMapping("/policies/{id}")
    public PolicyEntity update(@PathVariable("id") Integer id, PolicyEntity entity) {
        entity.setId(id);
        return this.service.update(entity);
    }

    @DeleteMapping("/policies/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        this.service.deleteById(id);
    }
}
