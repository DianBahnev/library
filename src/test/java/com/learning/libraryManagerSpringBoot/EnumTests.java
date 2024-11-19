package com.learning.libraryManagerSpringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import javax.security.auth.login.LoginContext;

public class EnumTests {

    /*
    0
    1
    2

    0->Login
    1->Admin
    2->Reset
    */


    @Test
    void someTest(){
        ValuesReasons valuesReasons = ValuesReasons.ADMIN;
        System.out.println(valuesReasons);

        System.out.print(ValuesReasons.getEnumBasedOn(0));
    }
}
