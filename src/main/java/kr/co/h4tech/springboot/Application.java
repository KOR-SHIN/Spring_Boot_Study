package kr.co.h4tech.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication Annotation이 있는 클래스부터 설정 파일을 읽기때문에
 * 항상 프로젝트 최상단에 위치해야 한다.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // Embedded WAS를 실행함
        SpringApplication.run(Application.class, args);
    }

}