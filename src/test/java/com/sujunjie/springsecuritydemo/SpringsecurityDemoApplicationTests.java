package com.sujunjie.springsecuritydemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringsecurityDemoApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bw = new BCryptPasswordEncoder();
        //加密，密文
        String encode = bw.encode("asd");
        System.out.println("encode = " + encode);
        //解密
        boolean matches = bw.matches("asd", encode);

        System.out.println("matches = " + matches);

    }

}
