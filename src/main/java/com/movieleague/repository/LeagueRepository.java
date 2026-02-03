package com.movieleague.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieleague.domain.League;

public interface LeagueRepository extends JpaRepository<League, Long> {
}
