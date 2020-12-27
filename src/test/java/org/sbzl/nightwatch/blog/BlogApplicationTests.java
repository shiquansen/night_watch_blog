package org.sbzl.nightwatch.blog;

import org.junit.jupiter.api.Test;
import org.sbzl.nightwatch.blog.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    InfoService infoService;

    @Test
    void contextLoads() {
        System.out.println( infoService.getInfo());

    }

}
