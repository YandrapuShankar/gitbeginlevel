package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Adhikritmodel;
@Repository
public interface AdhikritmodelRepo extends CrudRepository<Adhikritmodel, Integer> {

}
