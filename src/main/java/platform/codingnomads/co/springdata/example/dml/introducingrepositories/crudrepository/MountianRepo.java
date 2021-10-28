package platform.codingnomads.co.springdata.example.dml.introducingrepositories.crudrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MountianRepo extends CrudRepository<Mountain, Long> {
    List<Double> findElevationByNameStartingWith(String s);
}
