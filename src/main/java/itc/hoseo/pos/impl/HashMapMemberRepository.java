package itc.hoseo.pos.impl;

import itc.hoseo.pos.Repository.MemberRepository;
import itc.hoseo.pos.domain.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HashMapMemberRepository implements MemberRepository {
    public static final HashMapMemberRepository instance = new HashMapMemberRepository();
    HashMap<String, Member> map = new HashMap<>();

    @Override
    public Optional<Member> findById(Integer id) {
        return Optional.of(map.get(id));
    }

    @Override
    public List<Member> findById(String name) {
        //1. 결과로 돌려줄 변환 리스트 하나 생성
        List<Member> List = new ArrayList<>();
        //2. 맵 전체에서 K,V 모든 멤버를 가져옴
        for(Member m : map.values()){
            //이름이 넘어온 파라미터와 일치하면? > 리스트에 추가
            if(name.equals(m.getName())){
                List.add(m);
            }
        }
        return List;
        //위와 동일(람다식)
//        map.values().stream()
//                .filter(i -> {
//                    return name.equals(i.getName());
//                })
//                .collect(Collectors.toList());
    }

    @Override
    public void save(Member member) {
//        map.get()
    }

    @Override
    public List<Member> allMembers() {
        return null;
    }
}
