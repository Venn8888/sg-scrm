package com.sg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author venn
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.sg.**"})
@MapperScan(basePackages = "com.sg.**.mapper")
public class MiddleFacadeApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiddleFacadeApplication.class, args);
    }
}
