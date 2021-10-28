package platform.codingnomads.co.ioc.lab.initial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@Builder
public class Database {
    private String name;
    private double size;
}