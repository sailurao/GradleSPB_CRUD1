package com.example.demo;



import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PartService {

    @Autowired
    private PartRepository repo;

    public List<Part> listAll() {
        return repo.findAll();
    }

    public void save(Part part) {
        repo.save(part);
    }

    public Part get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}