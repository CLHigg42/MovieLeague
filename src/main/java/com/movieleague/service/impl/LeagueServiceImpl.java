package com.movieleague.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieleague.domain.League;
import com.movieleague.repository.LeagueRepository;
import com.movieleague.service.LeagueService;

@Service
public class LeagueServiceImpl implements LeagueService {
    private final LeagueRepository leagueRepository;

    public LeagueServiceImpl(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    @Override
    public League create(League league) { return leagueRepository.save(league); }

    @Override
    public League findById(Long id) { return leagueRepository.findById(id).orElse(null); }

    @Override
    public List<League> findAll() { return leagueRepository.findAll(); }
}
