package com.assignment.beans;

import com.assignment.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle_bean")
public class Vehicle {
    private String name;
    private final VehicleService vehicleService;
    @Autowired
    public Vehicle(VehicleService vehicleService) {
        System.out.println("Vehicle bean is created");
        name = "vitz";
        this.vehicleService = vehicleService;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }
}
