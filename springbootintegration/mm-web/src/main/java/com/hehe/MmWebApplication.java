package com.hehe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: yule
 * @Date: 2018/8/6 0006 14:29
 * @Description:
 */
@SpringBootApplication
@EnableSwagger2
public class MmWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmWebApplication.class, args);
    }

}
