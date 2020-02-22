package com.oclkstudio.jpa.dao;

import com.oclkstudio.jpa.entity.Simeranya;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SimeranyaDepository extends JpaRepository<Simeranya, Integer> {
    public List<Simeranya> findByNameAndDescription(String name, String description);

    public List<Simeranya> findByNameOrDescription(String name, String description);
}
