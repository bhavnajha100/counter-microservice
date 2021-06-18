package com.example.microservice.countermicroservice;


public class Request {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Request(int data) {
        this.data = data;
    }

    public Request() {
    }
}
