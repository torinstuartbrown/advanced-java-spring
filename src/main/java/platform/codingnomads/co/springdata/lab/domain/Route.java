package platform.codingnomads.co.springdata.lab.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "routes")
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class Route implements Serializable {
    private static final long serialVersionUID = -2624055642258734917L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String code;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(
            name = "origin_area_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_routes_origin_area_id")
    )
    private Area origin;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(
            name = "destination_area_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "fk_routes_destination_area_id")
    )
    private Area destination;

    public Route(Area origin, Area destination) {
        this.origin = origin;
        this.destination = destination;
        this.code = (origin.getCode() + "-" + destination.getCode());
    }

//    public List<Attraction> getAttactions(){
//        List<Attraction> attractions = origin.getAttraction()
//    }



}
