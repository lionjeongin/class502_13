package org.choongang.global.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DBConfig {

    @PersistenceContext
    private EntityManager em;

    @Bean // 조립해서 관리객체로 쓰기!
    public JPAQueryFactory jpaQueryFactory() {
         return new JPAQueryFactory(em);
    }
}