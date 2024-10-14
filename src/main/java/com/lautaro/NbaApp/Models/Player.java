package com.lautaro.NbaApp.Models;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private int jersey_number;
    private String position;
    private String height;
    private String weight;
    private String country;
    private String college;
    private int draft_year;
    private int draft_round;
    private int draft_number;

    //nba team
    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;


    //Default constructor
    public Player() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getJersey_number() {
        return jersey_number;
    }

    public void setJersey_number(int jersey_number) {
        this.jersey_number = jersey_number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getDraft_year() {
        return draft_year;
    }

    public void setDraft_year(int draft_year) {
        this.draft_year = draft_year;
    }

    public int getDraft_round() {
        return draft_round;
    }

    public void setDraft_round(int draft_round) {
        this.draft_round = draft_round;
    }

    public int getDraft_number() {
        return draft_number;
    }

    public void setDraft_number(int draft_number) {
        this.draft_number = draft_number;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", jersey_number=" + jersey_number +
                ", position='" + position + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", country='" + country + '\'' +
                ", college='" + college + '\'' +
                ", draft_year=" + draft_year +
                ", draft_round=" + draft_round +
                ", draft_number=" + draft_number +
                ", team=" + team +
                '}';
    }
}
