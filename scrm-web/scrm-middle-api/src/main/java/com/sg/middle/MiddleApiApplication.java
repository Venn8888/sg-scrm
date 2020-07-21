package com.sg.middle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author venn
 * @version 1.0.0
 * @date 2020/7/17
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableOpenApi
public class MiddleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddleApiApplication.class, args);
    }

}
