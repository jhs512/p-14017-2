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
        String queryString = cmd.split("\\?", 2)[1];

        String[] paramBits = queryString.split("=", 2);

        String paramName = paramBits[0];
        String paramValue = paramBits[1];

        if (!name.equals(paramName)) return defaultValue;

        return paramValue;
    }
}
