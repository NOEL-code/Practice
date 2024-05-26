package org.example.jpa;

import org.assertj.core.api.Assertions;
import org.example.jpa.domain.Member;
import org.example.jpa.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
            Member member = new Member();
            member.setName("memberA");

            Long saved = memberRepository.save(member);
            Member findMember = memberRepository.findById(saved);

        Assertions.assertThat(findMember.getName()).isEqualTo(member.getName());
        Assertions.assertThat(findMember.getId()).isEqualTo(saved);
        Assertions.assertThat(findMember).isEqualTo(member);
    }

}
