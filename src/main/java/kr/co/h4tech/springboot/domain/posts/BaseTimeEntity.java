package kr.co.h4tech.springboot.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * <pre>
 * @MappedSuperclass
 *  - JPA Entity 클래스들이 BaseTimeEntity를 상속할 경우 필드들(createdDate, modifiedDate)도 컬럼으로 인식한다.
 * @EntityListner(AuditingEntityListener.class)
 *  - BaseTimeEntity 클래스에 Auditing기능을 포함한다.
 * @CreatedDate
 *  - Entity가 생생되어 저장될 때 시간이 자동 저장된다.
 * @LastModifiedDate
 *  - 조회한 Entity의 값을 변경할 때 시간이 자동저장 된다.
 * </pre>
 */
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
