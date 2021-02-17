package org.peanutvideo.util;

import java.util.Random;

/**
 * @author ddpapa
 * 利用随机数获取一个验证码
 */
public class PINGenerator {
    private String code;
    public static String getCode(){
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 6; i++){
            buffer.append(random.nextInt(10));
        }
        return buffer.toString();
    }
}
