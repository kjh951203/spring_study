package com.example.hello.hellospring;

import com.example.hello.hellospring.discount.DiscountPolicy;
import com.example.hello.hellospring.discount.FixDiscountPolicy;
import com.example.hello.hellospring.discount.RateDiscountPolicy;
import com.example.hello.hellospring.member.MemberService;
import com.example.hello.hellospring.member.MemberServiceImpl;
import com.example.hello.hellospring.member.MemoryMemberRepository;
import com.example.hello.hellospring.order.OrderService;
import com.example.hello.hellospring.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(MemberRepository());
    }

    @Bean
    public MemoryMemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(MemberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
