package com.training.vehiclesys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={"com.*"})
@EntityScan( basePackages = {"com.*"} )
@EnableJpaRepositories( basePackages = {"com.*"} )
@ComponentScan(basePackages = {"com.training.vehiclesys.service"})
@ComponentScan(basePackages = {"com.training.vehiclesys.controller"})
@ComponentScan(basePackages = {"com.training.vehiclesys.repository"})
public class VehicleSysApplication {


    public static void main(String[] args) {

        SpringApplication.run(VehicleSysApplication.class, args);
    }

}
