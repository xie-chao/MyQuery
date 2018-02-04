package com.calix.myquery.annotation;

import com.calix.myquery.constant.GenerationType;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
public @interface Id {

    GenerationType strategy() default GenerationType.AUTO;

    String sequenceName() default "";

    int initialValue() default 1;

    int allocationSize() default 10;
}
