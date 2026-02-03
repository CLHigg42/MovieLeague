package com.movieleague.service;

import java.util.Optional;

import com.movieleague.domain.Member;

public interface MemberService {
    Member create(Member member);
    Optional<Member> findByUsername(String username);
}
