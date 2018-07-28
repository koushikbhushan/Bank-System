package com.casestudy.bank.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.bank.model.User;

public interface UserRepository extends MongoRepository<User, Serializable> {

}
