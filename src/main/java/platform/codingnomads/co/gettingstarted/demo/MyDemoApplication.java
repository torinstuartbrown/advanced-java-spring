package platform.codingnomads.co.gettingstarted.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyDemoApplication.class, args);
    }


}
