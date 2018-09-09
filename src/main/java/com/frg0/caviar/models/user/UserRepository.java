package com.frg0.caviar.models.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByName(String name);
    public User findAllByName(String name);
    public User findById(Integer id);
    public User findAllById(Integer id);
}
