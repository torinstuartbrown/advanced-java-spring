package platform.codingnomads.co.springdata.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import platform.codingnomads.co.springdata.lab.domain.Route;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route, Long>{
    Route findAreaByCode(String Code);
    List<Route> findByCodeContaining(String Code);
    Route findByCode(String Code);
    List<Route> findAllByCodeNotNull();


};





