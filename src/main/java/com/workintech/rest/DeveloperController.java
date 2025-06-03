package com.workintech.rest;

import com.workintech.model.Developer;
import com.workintech.model.Experience;
import com.workintech.tax.DeveloperTax;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/developers")
public class DeveloperController {

    private final DeveloperTax developerTax;
    public Map<Integer, Developer> developers;

    public DeveloperController(DeveloperTax developerTax) {
        this.developerTax = developerTax;
    }

    @PostConstruct
    public void init() {
        developers = new HashMap<>();
    }

    @PostMapping
    public ResponseEntity<Developer> addDeveloper(@RequestBody Developer developer) {
        developers.put(developer.getId(), developer);
        return new ResponseEntity<>(developer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Developer>> getAll() {
        return ResponseEntity.ok(new ArrayList<>(developers.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Developer> getById(@PathVariable int id) {
        Developer developer = developers.get(id);
        if (developer != null) {
            return ResponseEntity.ok(developer);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Developer> update(@PathVariable int id, @RequestBody Developer updatedDeveloper) {
        if (!developers.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        developers.put(id, updatedDeveloper);
        return ResponseEntity.ok(updatedDeveloper);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        developers.remove(id);
        return ResponseEntity.ok().build();
    }
}
