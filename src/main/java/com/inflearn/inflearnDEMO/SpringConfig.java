package com.inflearn.inflearnDEMO;

import com.inflearn.inflearnDEMO.repository.MemberRepository;
import com.inflearn.inflearnDEMO.repository.MemoryMemberRepository;
import com.inflearn.inflearnDEMO.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
