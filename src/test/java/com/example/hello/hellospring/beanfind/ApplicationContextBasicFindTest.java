package com.example.hello.hellospring.beanfind;

import com.example.hello.hellospring.AppConfig;
import com.example.hello.hellospring.member.Member;
import com.example.hello.hellospring.member.MemberService;
import com.example.hello.hellospring.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
       MemberService memberService =  ac.getBean("memberService", MemberService.class);
       Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);

    }

}
