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
@AllArgsConstructor
@NoArgsConstructor

public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String productName;
    double amount;

}
