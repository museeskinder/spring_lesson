package com.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
    private String name;
    private final VehicleService vehicleService;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    @Autowired
    public Vehicle(VehicleService vehicleService) {
        System.out.println("Vehicle bean is created");
        this.vehicleService = vehicleService;
        name = "vols";
    }
}
