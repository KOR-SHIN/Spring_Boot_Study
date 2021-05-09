package kr.co.h4tech.springboot.web.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // final이 포함된 field의 생성자를 생성해줌.
public class HelloResponseDao {

    private final String name;
    private final int amount;
}
