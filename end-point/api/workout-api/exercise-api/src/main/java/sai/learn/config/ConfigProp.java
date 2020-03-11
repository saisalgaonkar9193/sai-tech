package sai.learn.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;

@ConfigurationProperties("sai")
@Component
@Data
public class ConfigProp {

    private Name name;

    private Set<String> mail;



    @PostConstruct
    public void print(){
        System.out.println(this); try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(-109>>1);
        System.out.println(109<<1);
        System.out.println(-109>>>1);
    }


}

@Data
class Name{
    private String firstName;
    private String lastName;
}
