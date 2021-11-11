package platform.codingnomads.co.springdata.lab;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import platform.codingnomads.co.springdata.example.dml.derivedquerymethods.codewarriorexample.CodeWarrior;
import platform.codingnomads.co.springdata.lab.domain.Area;
import platform.codingnomads.co.springdata.lab.domain.Attraction;
import platform.codingnomads.co.springdata.lab.domain.Route;
import platform.codingnomads.co.springdata.lab.repository.AreaRepository;
import platform.codingnomads.co.springdata.lab.repository.AttractionRepository;
import platform.codingnomads.co.springdata.lab.repository.RouteRepository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataLab implements CommandLineRunner {

    private final RouteRepository routeRepository;
    private final AreaRepository areaRepository;
    private final AttractionRepository attractionRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringDataLab.class);
    }


    @Override
    public void run(String... args) throws Exception {

        Attraction attraction1 = new Attraction("Water World");
        Attraction attraction2 = new Attraction("Six Flags");
        Attraction attraction3 = new Attraction("Mount Rushmore");
        Attraction attraction4 = new Attraction("Aquarium");

        final List<Area> existingAreas = areaRepository.findAllByCodeNotNull();
        if (existingAreas.size() == 0) {


            final List<Area> areas = areaRepository.saveAll(

                    Arrays.asList(
                            Area.builder().code("G").attractions(List.of(attraction1)).build(),
                            Area.builder().code("H").attractions(List.of(attraction2)).build(),
                            Area.builder().code("Y").attractions(List.of(attraction3)).build(),
                            Area.builder().code("Z").attractions(List.of(attraction4)).build()
                    )
            );
        }


            if (routeRepository.findAllByCodeNotNull().size() == 0) {
                Route route1 = new Route(areaRepository.findAreaByCode("G"), areaRepository.findAreaByCode("H"));
                routeRepository.save(route1);
                Route route2 = new Route(areaRepository.findAreaByCode("H"), areaRepository.findAreaByCode("Y"));
                routeRepository.save(route2);
                Route route3 = new Route(areaRepository.findAreaByCode("Y"), areaRepository.findAreaByCode("Z"));
                routeRepository.save(route3);
            }


        System.out.println("*****************routesByArea**********************");
        final List<Route> routesByArea = routeRepository.findByCodeContaining("G");
        routesByArea.forEach(System.out::println);

        System.out.println("*******************routeA********************");
        final Route routeA = routeRepository.findByCode("G-H");
        System.out.println(routeA);



    }
}


