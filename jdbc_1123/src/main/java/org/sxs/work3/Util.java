package org.sxs.work3;

import java.lang.annotation.*;

/**
 * @ClassName: Util
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/23 17:11
 * @Version: V1.0
 */

@Documented
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface Util {
    String age() default " ";
}

