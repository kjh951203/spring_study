package com.example.hello.hellospring.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memeberId);
}
