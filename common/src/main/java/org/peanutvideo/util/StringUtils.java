package org.peanutvideo.util;

public class StringUtils extends org.apache.commons.lang3.StringUtils {
    /**
     * 判断空对象
     * @param object
     * @return
     */
    public static boolean isNull(Object object) {
        return object == null;
    }

    /**
     * 判断非空对象
     * @param object
     * @return true 非空 false 空
     */
    public static boolean isNotNull(Object object) {
        return !isNull(object);
    }
}
