package spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.core.discount.DiscountPolicy;
import spring.core.discount.RateDiscountPolicy;
import spring.core.member.MemberRepository;
import spring.core.member.MemberService;
import spring.core.member.MemberServiceImpl;
import spring.core.member.MemoryMemberRepository;
import spring.core.order.OrderService;
import spring.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {


    private MemberRepository memberRepository;
    private MemberService memberService;
    private OrderService orderService;
    private DiscountPolicy discountPolicy;
    private RateDiscountPolicy rateDiscountPolicy;

    @Bean
    public MemberService memberService() {
        if (memberService == null) {
            memberService = new MemberServiceImpl(memberRepository);
        }
        return memberService;
    }
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
            memberRepository(),
            discountPolicy());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }



}
