package com.movieleague.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieleague.domain.Round;

public interface RoundRepository extends JpaRepository<Round, Long> {
}
