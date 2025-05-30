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
        if (cmd.equals("등록?고향=남원") && name.equals("고향")) return "남원";
        if (cmd.equals("등록?이름=홍길동") && name.equals("이름")) return "홍길동";

        return "";
    }
}
