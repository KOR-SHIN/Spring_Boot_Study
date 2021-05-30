package kr.co.h4tech.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * SpringBootApplication Annotation이 있는 클래스부터 설정 파일을 읽기때문에
 * 항상 프로젝트 최상단에 위치해야 한다.
 *
 * EnableJpaAuditing
 *  - JPA Auditing 활성화
 *  - helloController 테스트에서 사용하기 위해 SpringBootApplication과 분리
 *  - jpaConfig파일 별도생성
 */
//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // Embedded WAS를 실행함
        SpringApplication.run(Application.class, args);
    }

}
