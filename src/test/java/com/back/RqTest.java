package com.back;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RqTest {
    @Test
    @DisplayName("\"수정?id=1\" : rq.getActionName()")
    void t1() {
        Rq rq = new Rq("수정?id=1");

        String actionName = rq.getActionName();

        assertEquals("수정", actionName);
    }

    @Test
    @DisplayName("\"삭제?id=1\" : rq.getActionName()")
    void t2() {
        Rq rq = new Rq("삭제?id=1");

        String actionName = rq.getActionName();

        assertEquals("삭제", actionName);
    }

    @Test
    @DisplayName("\"등록?이름=홍길동\" : rq.getParam(\"이름\", \"\")")
    void t3() {
        Rq rq = new Rq("등록?이름=홍길동");

        String paramValue = rq.getParam("이름", "");

        assertEquals("홍길동", paramValue);
    }

    @Test
    @DisplayName("\"등록?고향=남원\" : rq.getParam(\"고향\", \"\")")
    void t4() {
        Rq rq = new Rq("등록?고향=남원");

        String paramValue = rq.getParam("고향", "");

        assertEquals("남원", paramValue);
    }

    @Test
    @DisplayName("\"등록?이름=홍길동&고향=남원\" : rq.getParam(\"이름\", \"\")")
    void t5() {
        Rq rq = new Rq("등록?이름=홍길동&고향=남원");

        String paramValue = rq.getParam("이름", "");

        assertEquals("홍길동", paramValue);
    }
}
