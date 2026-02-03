package com.movieleague.service;

import java.util.List;

import com.movieleague.domain.League;

public interface LeagueService {
    League create(League league);
    League findById(Long id);
    List<League> findAll();
}
