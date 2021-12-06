package com.jojoldu.book.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application { // 프로젝트의 메인 클래스
    public static void main(String[] args) {
        // 내장 WAS 실행
        SpringApplication.run(Application.class, args);
    }
}
