package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.service", "com.example.implementation", "com.example.aspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
