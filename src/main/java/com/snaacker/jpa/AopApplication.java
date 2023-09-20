package com.snaacker.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopApplication.class, args);
    }
}
