package com.scaleup.java003.model;

public class Employee {

    private Integer id;
    private Integer status;
    private String name;
    private float temp;
    private Integer sleepHour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public Integer getSleepHour() {
        return sleepHour;
    }

    public void setSleepHour(Integer sleepHour) {
        this.sleepHour = sleepHour;
    }
}
