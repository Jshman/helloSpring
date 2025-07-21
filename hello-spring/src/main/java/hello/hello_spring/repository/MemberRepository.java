package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);                 // 홰원 저장
    Optional<Member> findById(Long Id);         // 회원 검색 by Id
    Optional<Member> findByName(String name);   // 회원 검색 by 이름
    List<Member> findAll();                     // 지금까지 저장된 회원들 리스트를 반환
}
