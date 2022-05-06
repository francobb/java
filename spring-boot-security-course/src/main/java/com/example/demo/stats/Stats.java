package com.example.demo.stats;//package com.example.demo.stats;


import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

//@ToString
//@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "stats")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "stats")
public class Stats implements Serializable {
//    @Setter(AccessLevel.NONE)
    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name="points_per_game", nullable = false, length = 100)
    private double ppg;

    @Column(name="field_goals_made", nullable = false, length = 100)
    private double fgm;

    @Column(name="field_goals_attempted", nullable = false, length = 100)
    private double fga;

    @Column(name="free_throws_attempted", nullable = false, length = 100)
    private double fta;

    @Column(name="free_throws_made", nullable = false, length = 100)
    private double ftm;

//    @Column(name="player", nullable = false)
//    private Player player;

//    public Stats(double ppg, double fgm, double fga, double fta, double ftm) {
//        this.ppg = ppg;
//        this.fgm = fgm;
//        this.fga = fga;
//        this.fta = fta;
//        this.ftm = ftm;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//        Stats stats = (Stats) o;
//        return id != null && Objects.equals(id, stats.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return getClass().hashCode();
//    }
}

