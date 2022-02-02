package platform.codingnomads.co.gettingstarted.demo;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Person getPersonBean(){
        return new Person();
    }
}
