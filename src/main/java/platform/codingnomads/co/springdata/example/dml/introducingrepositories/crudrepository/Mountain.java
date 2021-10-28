package platform.codingnomads.co.springdata.example.dml.introducingrepositories.crudrepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mountain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    double elevation;

    String name;


}
