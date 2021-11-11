package platform.codingnomads.co.springdata.lab.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import platform.codingnomads.co.springdata.lab.domain.Attraction;
import platform.codingnomads.co.springdata.lab.domain.Route;

import java.util.List;

public interface AttractionRepository extends JpaRepository<Attraction, Long>{
}
