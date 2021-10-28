package platform.codingnomads.co.ioc.lab.completed;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Component
@RequiredArgsConstructor
public class CodingNomad {


    private final JDK jdk;

    private final IDE ide;

    private final Framework framework;

    SoundSystem soundSystem;

    @Autowired
    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    @Autowired
    OperatingSystem operatingSystem;



    public String createAwesomeSoftware() {
        return MessageFormat
                .format("This coding nomad is creating awesome software using, " +
                                "IDE: ({0}:{1}), JDK: ({2}:{3}), Framework: ({4}:{5}), " +
                                "OS: ({6}:{7}), Sound System: ({8}:{9})",
                        ide.getName(),
                        ide.getVersion(),
                        jdk.getName(),
                        jdk.getVersion(),
                        framework.getName(),
                        framework.getVersion(),
                        operatingSystem.getName(),
                        operatingSystem.getVersion(),
                        soundSystem.getBrand(),
                        soundSystem.getType()
                );
    }
}
