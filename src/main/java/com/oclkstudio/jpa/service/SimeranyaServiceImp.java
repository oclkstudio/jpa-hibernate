package com.oclkstudio.jpa.service;

import com.oclkstudio.jpa.dao.SimeranyaDepository;
import com.oclkstudio.jpa.entity.Simeranya;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SimeranyaServiceImp implements SimeranyaService {
    @Autowired
    private SimeranyaDepository simeranyaDepository;

    private static final Logger logger = LoggerFactory.getLogger(SimeranyaServiceImp.class);

    /**
     *
     * @return all simeranya-s
     */
    @Override
    public List<Simeranya> findAll() {
        return simeranyaDepository.findAll();
    }

    /**
     *
     * @param id
     * @return simeranya (id)
     */
    @Override
    public Simeranya findById(int id) {
        Optional<Simeranya> result = simeranyaDepository.findById(id);

        Simeranya simeranya = null;

        if (result.isPresent()) {
            simeranya = result.get();
        } else {
            logger.info("Did not find the simeranya");

            throw new RuntimeException("Did not find simeranya id : " + id);
        }

        return simeranya;
    }

    /**
     *
     * @param simeranya
     * add the simeranya (simeranya)
     */
    @Override
    public void save(Simeranya simeranya) {
        simeranyaDepository.save(simeranya);
    }

    /**
     *
     * @param id
     * delete the simeranya (id)
     */
    @Override
    public void deleteById(int id) {
        simeranyaDepository.deleteById(id);
    }

    /**
     *
     * @param name
     * @param description
     * @return simeranya-s (name && description)
     */
    @Override
    public List<Simeranya> findByNameAndDescription(String name, String description) {
        return simeranyaDepository.findByNameAndDescription(name, description);
    }

    /**
     *
     * @param name
     * @param description
     * @return simeranya-s (name || description)
     */
    @Override
    public List<Simeranya> findByNameOrDescription(String name, String description) {
        return simeranyaDepository.findByNameOrDescription(name, description);
    }
}
