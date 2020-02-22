package com.oclkstudio.jpa.rest;

import com.oclkstudio.jpa.entity.Simeranya;
import com.oclkstudio.jpa.service.SimeranyaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simeranya")
public class SimeranyaController {
    @Autowired
    private SimeranyaService simeranyaService;

    @GetMapping("/all")
    public List<Simeranya> findAll() {
        return simeranyaService.findAll();
    }

    @GetMapping("/id={id}")
    public Simeranya findById(@PathVariable int id) {
        return simeranyaService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Simeranya simeranya) {
        simeranya.setId(0);
        simeranyaService.save(simeranya);
    }

    @PutMapping("/update")
    public void update(@RequestBody Simeranya simeranya) {
        simeranyaService.save(simeranya);
    }

    @DeleteMapping("/id={id}")
    public void deleteById(@PathVariable int id) {
        simeranyaService.deleteById(id);
    }

    @GetMapping("/name={name}&description={description}")
    public List<Simeranya> findByNameAndDescription(@PathVariable String name, @PathVariable String description) {
        return simeranyaService.findByNameAndDescription(name, description);
    }

    @GetMapping("/name={name}--description={description}")
    public List<Simeranya> findByNameOrDescription(@PathVariable String name, @PathVariable String description) {
        return simeranyaService.findByNameOrDescription(name, description);
    }
}
