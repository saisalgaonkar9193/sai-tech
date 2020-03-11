package sai.learn.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

@Configuration
public class Predicators {

    @Bean
    public BiPredicate<String,Integer> chasisNoLength(){
        return (chasisNo,length)->{
            System.out.println("chasisNoLength");
          return   chasisNo.trim().replaceAll(" ", "").length()<length;
        };
    }

    @Bean
    public BiPredicate<String,String> chasisRegex(){
        return (chasisNo,pattern)->{
            System.out.println("chasisRegex");
            return   chasisNo.trim().replaceAll(" ", "").matches(pattern);
        };
    }
}
