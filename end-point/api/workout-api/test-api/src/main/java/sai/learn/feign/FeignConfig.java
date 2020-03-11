package sai.learn.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
//@Configuration
public class FeignConfig {

    @Bean
    public ErrorDecoder getErrorDecoder(){
        return new FeignDecoder();
    }

}


class FeignDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        System.out.println(response.status());
        System.out.println(response.reason());
        printBodyContent(response.body());
        return new Exception("Reason :"+response.reason());
    }

    private void printBodyContent(Response.Body body) {
        try {
            byte[] byt=new byte[body.length()];
            body.asInputStream().read(byt);
            String str=new String(byt);
            System.out.println("--->"+str);
        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}