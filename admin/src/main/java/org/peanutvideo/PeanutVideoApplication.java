package org.peanutvideo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ddpapa
 * @date 2020/11/19 23:32
 */
@SpringBootApplication
@MapperScan("org.peanutvideo.system.mapper")
public class PeanutVideoApplication {
    public static void main(String[] args) {
        System.out.println("滚来滚去……~(～o￣▽￣)～o 。。。滚来滚去……o～(＿△＿o～) ~。。。");
        SpringApplication springApplication = new SpringApplication(PeanutVideoApplication.class);
        springApplication.run(args);
        System.out.println("  ******** **     **   ******    ******  ********  ********  ********\n" +
                " **////// /**    /**  **////**  **////**/**/////  **//////  **////// \n" +
                "/**       /**    /** **    //  **    // /**      /**       /**       \n" +
                "/*********/**    /**/**       /**       /******* /*********/*********\n" +
                "////////**/**    /**/**       /**       /**////  ////////**////////**\n" +
                "       /**/**    /**//**    **//**    **/**             /**       /**\n" +
                " ******** //*******  //******  //****** /******** ********  ******** \n" +
                "////////   ///////    //////    //////  //////// ////////  ////////  \n");
        System.out.println("逗趣启动成功，成功了。。。。。─=≡Σ((( つ•̀ω•́)つ动感光波哔哔哔!!!!");
    }
}
