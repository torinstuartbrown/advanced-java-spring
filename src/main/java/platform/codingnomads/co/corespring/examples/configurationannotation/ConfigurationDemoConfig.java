package platform.codingnomads.co.corespring.examples.configurationannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import platform.codingnomads.co.gettingstarted.demo.Person;

import java.util.ArrayList;

@Configuration
@ComponentScan
public class ConfigurationDemoConfig {
//    @Bean
//    public SampleClass sampleClass() {
//        return new SampleClass();
//    }

    @Bean
    public ArrayList<String> sampleList() {return new ArrayList<>();}

}
