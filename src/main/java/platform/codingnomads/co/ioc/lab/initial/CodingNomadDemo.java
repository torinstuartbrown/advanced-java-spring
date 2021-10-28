package platform.codingnomads.co.ioc.lab.initial;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CodingNomadDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                CodingNomadConfiguration.class);
        CodingNomad codingNomad = ctx.getBean(CodingNomad.class);
        System.out.println(codingNomad.createAwesomeSoftware());
    }
}