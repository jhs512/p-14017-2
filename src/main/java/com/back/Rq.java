package com.back;


public class Rq {
    private final String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        return cmd.split("\\?", 2)[0];
    }

    public String getParam(String name, String defaultValue) {
        return "홍길동";
    }
}
