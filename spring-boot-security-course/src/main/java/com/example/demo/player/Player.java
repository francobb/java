package com.example.demo.player;

import com.example.demo.stats.Stats;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@Builder
@Data
@Entity(name = "player")
@Getter
@NoArgsConstructor
@Setter
@Table(name = "player")
public class Player implements Serializable {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String first_name;

    @Column(name = "last_name", nullable = false, length = 50)
    private String last_name;

    @Column(name = "height", nullable = false)
    private String height;

    @Column(name = "position", nullable = false)
    private String position;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "stats_id")
    private Stats stats;
}
