package sai.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableCircuitBreaker
@EnableFeignClients
public class CrossfitAppliction {
    public static void main(String[] args) {
        SpringApplication.run(CrossfitAppliction.class, args);
    }
}
