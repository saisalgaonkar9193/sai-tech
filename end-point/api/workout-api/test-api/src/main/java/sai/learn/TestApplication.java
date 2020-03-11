package sai.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class TestApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TestApplication.class, args);
    }
}
