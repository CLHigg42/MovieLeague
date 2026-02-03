package com.movieleague.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieleague.domain.League;
import com.movieleague.service.LeagueService;

@RestController
@RequestMapping("/api/leagues")
public class LeagueController {
    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) { this.leagueService = leagueService; }

    @PostMapping
    public ResponseEntity<League> create(@RequestBody League league) {
        return ResponseEntity.ok(leagueService.create(league));
    }

    @GetMapping
    public ResponseEntity<List<League>> list() { return ResponseEntity.ok(leagueService.findAll()); }

    @GetMapping("/{id}")
    public ResponseEntity<League> get(@PathVariable Long id) {
        League l = leagueService.findById(id);
        if (l == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(l);
    }
}
