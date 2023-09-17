package com.assignment.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.assignment.implementations", "com.assignment.services"})
@ComponentScan(basePackageClasses = {com.assignment.beans.Vehicle.class, com.assignment.beans.Person.class})
public class ProjectConfig {
}
