package com.nbaliga.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class PlayerGameStats implements Serializable {

    @Id
    private Long id;
    private Integer seasonDay;
    private Integer league;
    private String team;
    private Integer opponent;
    private Integer minutes;
    private Integer fgm;
    private Integer fga;
    private Integer ftm;
    private Integer fta;
    @Column(name = "3PM")
    private Integer threePm;
    @Column(name = "3PA")
    private Integer threePa;
    private Integer offensiveRebounds;
    private Integer rebounds;
    private Integer assists;
    private Integer steals;
    private Integer blocks;
    private Integer turnovers;
    private Integer points;
    private Integer fouls;
    private Integer plusMinus;
    private Integer position;
    private Integer starter;


}