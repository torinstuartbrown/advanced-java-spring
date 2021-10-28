package platform.codingnomads.co.ioc.lab.initial;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
@RequiredArgsConstructor
public class CodingNomad {
    private final JDK jdk;
    private final IDE ide;
    private final Framework framework;
    private final VirtualMachine virtualMachine;
    private final Database database;

    public String createAwesomeSoftware() {
        return MessageFormat
                .format("This Coding Nomad is creating awesome software using, " +
                                "IDE: ({0}:{1}), JDK: ({2}:{3}), Framework: ({4}:{5}), + " +
                                "Virtual Machine: ({6}:{7}), Database: ({8}:{9})",
                        ide.getName(),
                        ide.getVersion(),
                        jdk.getName(),
                        jdk.getVersion(),
                        framework.getName(),
                        framework.getVersion(),
                        database.getName(),
                        database.getSize(),
                        virtualMachine.getId(),
                        virtualMachine.getName()

                );
    }
}