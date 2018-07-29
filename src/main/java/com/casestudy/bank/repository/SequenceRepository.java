package com.casestudy.bank.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.bank.model.CustomSequences;

public interface SequenceRepository extends MongoRepository<CustomSequences, Serializable> {
}
