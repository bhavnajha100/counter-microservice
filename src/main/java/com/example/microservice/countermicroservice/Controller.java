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
    {          synchronized(this) {
        Counter counter = counterRepo.findById(123).get();
        Integer counterValue = counter.getCounter() + 1;
        counter.setCounter(counterValue);
        return counterRepo.save(counter).getCounter();
    }
    }

    @GetMapping("/decrementCounter")
    public Integer decrementCounter(){
        synchronized(this) {
            Counter counter = counterRepo.findById(123).get();
            Integer counterValue = counter.getCounter() - 1;
            counter.setCounter(counterValue);
            return counterRepo.save(counter).getCounter();
        }
    }

}
