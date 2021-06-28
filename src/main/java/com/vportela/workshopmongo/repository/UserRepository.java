package com.vportela.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vportela.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
