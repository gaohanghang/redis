package org.hackerandpainter.springdataredis;

import org.hackerandpainter.springdataredis.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataRedisApplicationTests {

    @Autowired
    HelloService helloService;

    @Test
    public void contextLoads() {
        //helloService.hello();
        helloService.hello2();
    }

}
