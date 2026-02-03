package com.movieleague.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieleague.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
