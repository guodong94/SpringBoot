package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Administrator on 2018/7/4.
 */
@SpringBootApplication
@EnableSwagger2
public class SpringBoot {
    public static void main(String [] args){
        SpringApplication.run(SpringBoot.class);
    }

    public String  test(){
        return "Hello World";
    }
}
