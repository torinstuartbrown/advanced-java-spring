package platform.codingnomads.co.gettingstarted.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Component
@Data

public class Person {
    public String name;
    public int age;

    public Person() {
        this.name = "ryan";
        this.age = 39;
    }
}
