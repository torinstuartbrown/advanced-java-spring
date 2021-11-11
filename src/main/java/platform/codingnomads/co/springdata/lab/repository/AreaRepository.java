package platform.codingnomads.co.springdata.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import platform.codingnomads.co.springdata.lab.domain.Area;
import platform.codingnomads.co.springdata.lab.domain.Route;

import java.util.List;

public interface AreaRepository extends JpaRepository<Area,Long> {
    Area findAreaById (Long id);
    Area findAreaByCode(String Code);
    List<Area> findAllByCodeNotNull();


}
