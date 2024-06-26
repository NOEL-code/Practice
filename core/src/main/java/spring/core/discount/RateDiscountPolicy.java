package spring.core.discount;

import org.springframework.stereotype.Component;
import spring.core.annotation.MainAnnotationPolicy;
import spring.core.member.Grade;
import spring.core.member.Member;

@Component
@MainAnnotationPolicy
public class RateDiscountPolicy implements  DiscountPolicy{

    private int discountRate = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return  price * discountRate / 100;
        }else {
            return 0;
        }
    }
}
