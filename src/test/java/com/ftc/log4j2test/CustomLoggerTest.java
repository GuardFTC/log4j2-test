package com.ftc.log4j2test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomLoggerTest {

    @Test
    void info() {
        CustomLogger.info("天使萌和桃谷绘里香,当然还有桥本有菜");
        CustomLogger.info("哦对了还有辉月杏梨");
    }
}