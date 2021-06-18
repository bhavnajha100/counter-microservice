package com.example.microservice.countermicroservice;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counter")
public class Counter {

    @Id
    private int id;
    private int counter;

    public Counter(int id, int counter) {
        this.id = id;
        this.counter = counter;
    }

    public Counter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
