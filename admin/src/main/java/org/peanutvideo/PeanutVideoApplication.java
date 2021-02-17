package org.peanutvideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ddpapa
 * @date 2020/11/19 23:32
 */
@SpringBootApplication
public class PeanutVideoApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(PeanutVideoApplication.class);
        springApplication.run(args);
        System.out.println("==========================start successfully===============================");
    }
}
