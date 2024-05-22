package org.example.jpa;

import org.assertj.core.api.Assertions;
import org.example.jpa.domain.Member1;
import org.example.jpa.domain.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Tran  sactional
    @Rollback(false)
    public void testMember() throws Exception {
            Member1 member = new Member1();
            member.setUsername("memberA");

            Long saved = memberRepository.save(member);
            Member1 findMember = memberRepository.find(saved);

        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        Assertions.assertThat(findMember.getId()).isEqualTo(saved);
        Assertions.assertThat(findMember).isEqualTo(member);
    }

}
