package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;


@RestController
public class PartController {

    @Autowired
    private PartService service;

    // RESTful API methods for Retrieval operations
    @GetMapping("/parts")
    public List< Part> list() {
        return service.listAll();
    }

    @GetMapping("/parts/{id}")
    public ResponseEntity< Part> get(@PathVariable Integer id) {
        try {
             Part part = service.get(id);
            return new ResponseEntity< Part>(part, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity< Part>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Create operation
    @PostMapping("/parts")
    public void add(@RequestBody  Part part) {
        service.save(part);
    }

    // RESTful API method for Update operation
    @PutMapping("/parts/{id}")
    public ResponseEntity<?> update(@RequestBody  Part part, @PathVariable Integer id) {
        try {
             Part existProduct = service.get(id);
            service.save(part);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



    // RESTful API method for Delete operation
    @DeleteMapping("/parts/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}