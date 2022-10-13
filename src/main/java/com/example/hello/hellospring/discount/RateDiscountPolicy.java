package com.example.hello.hellospring.discount;

import com.example.hello.hellospring.member.Grade;
import com.example.hello.hellospring.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountRate = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return price * discountRate / 100;
        }
        else {
            return 0;
        }
    }
}

