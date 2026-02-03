package com.movieleague.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieTitle;

    private String metadata;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Round round;

    public Submission() {}

    public Long getId() { return id; }
    public String getMovieTitle() { return movieTitle; }
    public void setMovieTitle(String movieTitle) { this.movieTitle = movieTitle; }
    public String getMetadata() { return metadata; }
    public void setMetadata(String metadata) { this.metadata = metadata; }
    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }
    public Round getRound() { return round; }
    public void setRound(Round round) { this.round = round; }
}
