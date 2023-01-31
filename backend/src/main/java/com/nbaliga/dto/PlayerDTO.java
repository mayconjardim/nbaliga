package com.nbaliga.dto;

import com.nbaliga.entities.Player;
import lombok.*;

import javax.persistence.Id;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PlayerDTO implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String name;
    private Integer height;
    private Integer weight;
    private Integer age;
    private Integer birthMonth;
    private Integer birthDay;
    private Integer birthYear;
    private String currentLeague;
    private Integer currentLeagueId;
    private String currentTeam;
    private Integer currentTeamId;
    private String contractTeam;
    private Integer contractTeamId;
    private String injury;
    private Integer timeInjured;
    private Boolean inactive;
    private Integer positionNumber;
    private Integer experience;
    private String college;
    private String city;
    private String state;
    private Integer greed;
    private Integer happiness;
    private Integer loyalty;
    private Integer winner;
    private String insideScoring;
    private String jumpShot;
    private String freeThrowShot;
    private String threePointShot;
    private String handling;
    private String passing;
    private String offensiveRebounding;
    private String defensiveRebounding;
    private String postDefense;
    private String perimeterDefense;
    private String stealing;
    private String shotBlocking;
    private String quickness;
    private String strength;
    private String stamina;
    private String jumping;
    private String pot_inside;
    private String pot_jumpShot;
    private String pot_freeThrow;
    private String pot_3pShot;
    private String pot_handling;
    private String pot_passing;
    private String pot_oRebounding;
    private String pot_dRebounding;
    private String pot_postDefense;
    private String pot_perimeterDefense;
    private String pot_stealing;
    private String pot_blocking;
    private String currentRating;
    private String futureRating;
    private String overallRating;
    private String overallPotential;
    private Integer championships;
    private Integer playerOfGame;
    private Integer playerOfWeek;
    private Integer playerOfMonth;
    private Integer contract1;
    private Integer contract2;
    private Integer contract3;
    private Integer contract4;
    private Integer contract5;
    private Integer birdYears;

    public PlayerDTO(Player entity) {
        this.id = entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.name = entity.getName();
        this.height = entity.getHeight();
        this.weight = entity.getWeight();
        this.age = entity.getAge();
        this.birthMonth = entity.getBirthMonth();
        this.birthDay = entity.getBirthDay();
        this.birthYear = entity.getBirthYear();
        this.currentLeague = entity.getCurrentLeague();
        this.currentLeagueId = entity.getCurrentLeagueId();
        this.currentTeam = entity.getCurrentTeam();
        this.currentTeamId = entity.getCurrentTeamId();
        this.contractTeam = entity.getContractTeam();
        this.contractTeamId = entity.getContractTeamId();
        this.injury = entity.getInjury();
        this.timeInjured = entity.getTimeInjured();
        this.inactive = entity.getInactive();
        this.positionNumber = entity.getPositionNumber();
        this.experience = entity.getExperience();
        this.college = entity.getCollege();
        this.city = entity.getCity();
        this.state = entity.getState();
        this.greed = entity.getGreed();
        this.happiness = entity.getHappiness();
        this.loyalty = entity.getLoyalty();
        this.winner = entity.getWinner();
        this.insideScoring = entity.getInsideScoring();
        this.jumpShot = entity.getJumpShot();
        this.freeThrowShot = entity.getFreeThrowShot();
        this.threePointShot = entity.getThreePointShot();
        this.handling = entity.getHandling();
        this.passing = entity.getPassing();
        this.offensiveRebounding = entity.getOffensiveRebounding();
        this.defensiveRebounding = entity.getDefensiveRebounding();
        this.postDefense = entity.getPostDefense();
        this.perimeterDefense = entity.getPerimeterDefense();
        this.stealing = entity.getStealing();
        this.shotBlocking = entity.getShotBlocking();
        this.quickness = entity.getQuickness();
        this.strength = entity.getStrength();
        this.stamina = entity.getStamina();
        this.jumping = entity.getJumping();
        this.pot_inside = entity.getPot_inside();
        this.pot_jumpShot = entity.getPot_jumpShot();
        this.pot_freeThrow = entity.getPot_freeThrow();
        this.pot_3pShot = entity.getPot_3pShot();
        this.pot_handling = entity.getPot_handling();
        this.pot_passing = entity.getPot_passing();
        this.pot_oRebounding = entity.getPot_oRebounding();
        this.pot_dRebounding = entity.getPot_dRebounding();
        this.pot_postDefense = entity.getPot_postDefense();
        this.pot_perimeterDefense = entity.getPot_perimeterDefense();
        this.pot_stealing = entity.getPot_stealing();
        this.pot_blocking = entity.getPot_blocking();
        this.currentRating = entity.getCurrentRating();
        this.futureRating = entity.getFutureRating();
        this.overallRating = entity.getOverallRating();
        this.overallPotential = entity.getOverallPotential();
        this.championships = entity.getChampionships();
        this.playerOfGame = entity.getPlayerOfGame();
        this.playerOfWeek = entity.getPlayerOfWeek();
        this.playerOfMonth = entity.getPlayerOfMonth();
        this.contract1 = entity.getContract1();
        this.contract2 = entity.getContract2();
        this.contract3 = entity.getContract3();
        this.contract4 = entity.getContract4();
        this.contract5 = entity.getContract5();

    }

}