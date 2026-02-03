package com.movieleague.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieleague.domain.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
