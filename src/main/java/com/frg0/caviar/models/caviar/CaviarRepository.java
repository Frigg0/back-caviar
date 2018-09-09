package com.frg0.caviar.models.caviar;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaviarRepository extends MongoRepository<Caviar, String> {
    public Caviar findByName(String name);
    public Caviar findAllByName(String name);
    public Caviar findById(Integer id);
    public Caviar findAllById(Integer id);
}
