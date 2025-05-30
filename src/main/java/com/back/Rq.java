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

        String[] queryStringBits = queryString.split("&");

        for (String paramStr : queryStringBits) {
            String[] paramStrBits = paramStr.split("=", 2);
            String paramName = paramStrBits[0];
            String paramValue = paramStrBits[1];

            if (paramName.equals(name)) return paramValue;
        }

        return defaultValue;
    }
}
