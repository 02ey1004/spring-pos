package itc.hoseo.pos.domain;

import itc.hoseo.pos.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SpringBootTest

class MemberTests {
    void test_김몽남() {
        Member m2 = Member.builder()
                .name("김몽남")
                .build();

        assertEquals("김몽남", m2.getName());
        assertEquals(null, m2.getName());

    }

    void test_마봉필(){
//        Member m1 = new Member(1,"마봉필","1",30);
//        assertEquals("마봉필",m1.getName());
//        assertEquals(null,m1.getAge());

    }
}
