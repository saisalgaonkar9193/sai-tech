package sai.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaClient
public class ExerciseApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }
}
