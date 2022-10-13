package com.example.hello.hellospring.discount;

import com.example.hello.hellospring.member.Member;

public interface DiscountPolicy {
    /**
     *
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
