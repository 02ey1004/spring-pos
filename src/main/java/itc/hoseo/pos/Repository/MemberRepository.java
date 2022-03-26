package itc.hoseo.pos.Repository;

import itc.hoseo.pos.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    //    ID로 멤버찾음
    public Optional<Member> findById(Integer id);

    //    이름으로 멤버찾음
    public List<Member> findById(String name);

    //    멤버를 저장
    public void save(Member member);

    //    모든회원 반환
    public List<Member> allMembers();
}
