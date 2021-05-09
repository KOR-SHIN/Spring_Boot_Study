package kr.co.h4tech.springboot.web.dao;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDaoTest {

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDao dao = new HelloResponseDao(name, amount);

        // then
        assertThat(dao.getName()).isEqualTo(name);
        assertThat(dao.getAmount()).isEqualTo(amount);
    }

}
