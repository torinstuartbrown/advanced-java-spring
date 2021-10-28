package platform.codingnomads.co.ioc.lab.completed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@Builder

public class SoundSystem {
    // the sound system is a very important development tool :)
    private String type;
    private String brand;
}
