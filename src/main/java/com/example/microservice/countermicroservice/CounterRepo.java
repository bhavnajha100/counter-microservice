package com.example.microservice.countermicroservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CounterRepo extends JpaRepository<Counter,Integer> {
    @Override
    Optional<Counter> findById(Integer integer);
}
