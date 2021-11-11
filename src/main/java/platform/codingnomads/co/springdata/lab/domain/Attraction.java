package platform.codingnomads.co.springdata.lab.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "attractions")
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class Attraction implements Serializable {
    private static final long serialVersionUID = -2624055642258734917L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    public Attraction(String name) {
        this.name = name;
    }
}

