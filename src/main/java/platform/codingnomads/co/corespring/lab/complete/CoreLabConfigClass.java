package platform.codingnomads.co.corespring.lab.complete;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import platform.codingnomads.co.corespring.lab.Program;
import platform.codingnomads.co.corespring.lab.StreamingService;

@Configuration
@ImportResource({"classpath*:xml-config/programs/programs.xml"})
public class CoreLabConfigClass {

    @Bean
    public StreamingService streamingService() {return new StreamingService("Hulu", "Add-free");}

}
