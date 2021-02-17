package org.peanutvideo.util;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PINGeneratorTest {

    @Test
    public void getCode() {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 6; i++){
            buffer.append(random.nextInt(10));
            System.out.println(buffer.toString());
        }
    }
}