package com.example.petproject.repository;

import com.example.petproject.model.PyramidBilliardCues;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PyramidBilliardCuesRepository extends CrudRepository<PyramidBilliardCues, Long> {

    List<PyramidBilliardCues> findByProducer(String producer);
}