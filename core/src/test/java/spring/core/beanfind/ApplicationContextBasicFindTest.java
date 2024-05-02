package spring.core.beanfind;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.core.AppConfig;
import spring.core.member.MemberService;
import spring.core.member.MemberServiceImpl;

public class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름 조회")
    void findBeanByName(){
        MemberService memberService = context.getBean("memberService",MemberService.class);

        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);

    }

    @Test
    @DisplayName("타입으로 빈 조회")
    void findBeanByType (){
        MemberService memberService = context.getBean(MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);

    }

    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByDetailType (){
        MemberService memberService = context.getBean("memberService",MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);

    }
}
