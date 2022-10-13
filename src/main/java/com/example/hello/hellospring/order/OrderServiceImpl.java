package com.example.hello.hellospring.order;

import com.example.hello.hellospring.discount.DiscountPolicy;
import com.example.hello.hellospring.discount.FixDiscountPolicy;
import com.example.hello.hellospring.discount.RateDiscountPolicy;
import com.example.hello.hellospring.member.Member;
import com.example.hello.hellospring.member.MemberRepository;
import com.example.hello.hellospring.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository ;
    private final DiscountPolicy discountPolicy ;


    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
