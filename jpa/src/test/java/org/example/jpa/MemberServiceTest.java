package org.example.jpa;

import org.assertj.core.api.Assertions;
import org.example.jpa.domain.Member;
import org.example.jpa.repository.MemberRepository;
import org.example.jpa.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;



    @Test
    public void join() throws Exception {

        Member member = new Member();
        member.setName("Kin");

        Long id = memberService.join(member);

        Assertions.assertThat(member).isEqualTo(memberRepository.findById(id));
    }

    @Test()
    void duplicate() throws Exception {

        Member member = new Member();
        member.setName("Kin");

        Member member2 = new Member();
        member2.setName("Kin");

        memberService.join(member);
        try{
            memberService.join(member2);
        } catch (IllegalStateException e){
            return;
        }
    }
}
