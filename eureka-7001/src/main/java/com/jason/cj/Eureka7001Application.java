package com.jason.cj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jiancheng
 * @date 2022/7/7 5:15 PM
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001Application {
    public static void main(String args[]){
        SpringApplication.run(Eureka7001Application.class,args);
    }

}
