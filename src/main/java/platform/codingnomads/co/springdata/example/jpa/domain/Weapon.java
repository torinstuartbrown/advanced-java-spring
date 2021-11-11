package platform.codingnomads.co.springdata.example.jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "weapons")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Weapon {
    @Id
    @GeneratedValue(generator = "weapon_generator")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private CodeWarrior codeWarrior;

    @Column
    private String name;
}
