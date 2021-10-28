package platform.codingnomads.co.corespring.lab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import platform.codingnomads.co.corespring.lab.complete.CoreLabConfig;
import platform.codingnomads.co.corespring.lab.complete.CoreLabConfigClass;

@SpringBootApplication
public class CoreLabApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                CoreLabConfigClass.class);

        StreamingService streamingService = ctx.getBean(StreamingService.class);

        System.out.println("On Thursdays after work I like to open my " + streamingService.getName() + "account. I even " +
                "went above and beyond and got " + streamingService.getVersion() + "!");

        String[] programs = ctx.getBeanNamesForType(Program.class);

        for (String program : programs){
            System.out.println("Let's watch: Season: "  + ctx.getBean(program, Program.class).getSeason() + " Episode: "
                    + ctx.getBean(program, Program.class).getEpisode() + " of " + ctx.getBean(program, Program.class).getName());
        }

        System.out.println("Let's log out.");
    }
}
