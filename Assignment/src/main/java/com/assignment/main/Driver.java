package com.assignment.main;

import com.assignment.beans.Vehicle;
import com.assignment.beans.VehicleService;
import com.assignment.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleService();
    }
}
