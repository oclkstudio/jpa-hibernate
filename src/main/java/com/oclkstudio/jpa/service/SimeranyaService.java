package com.oclkstudio.jpa.service;

import com.oclkstudio.jpa.entity.Simeranya;

import java.util.List;

public interface SimeranyaService {
    public List<Simeranya> findAll();

    public Simeranya findById(int id);

    public void save(Simeranya simeranya);

    public void deleteById(int id);

    public List<Simeranya> findByNameAndDescription(String name, String description);

    public List<Simeranya> findByNameOrDescription(String name, String description);
}
