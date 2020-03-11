package sai.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages = {"com.bayview","sai.learn"})
@EnableEurekaClient
public class YogaApplication {
    public static void main(String[] args) {
        SpringApplication.run(YogaApplication.class, args);
    }
}
