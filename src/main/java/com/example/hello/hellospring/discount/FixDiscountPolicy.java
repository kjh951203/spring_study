package com.example.hello.hellospring.discount;

import com.example.hello.hellospring.member.Grade;
import com.example.hello.hellospring.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        else {
            return 0;
        }
    }
}
