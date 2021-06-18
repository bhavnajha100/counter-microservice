package com.example.microservice.countermicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    CounterRepo counterRepo;

    @GetMapping("/counter")
    public Integer getCounter()
    {
      return counterRepo.findById(123).get().getCounter();
    }
    @PostMapping("/counter")
    public Integer saveCounter(@RequestBody Request request)
    {
        Counter counter = counterRepo.findById(123).get();
        counter.setCounter(request.getData());
        return counterRepo.save(counter).getCounter();
    }
}
