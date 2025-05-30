package com.back;


import java.util.HashMap;
import java.util.Map;

public class Rq {
    private final String cmd;
    private final Map<String, String> params;

    public Rq(String cmd) {
        this.cmd = cmd;

        String queryString = cmd.split("\\?", 2)[1];

        String[] queryStringBits = queryString.split("&");

        params = new HashMap<>();

        for (String paramStr : queryStringBits) {
            String[] paramStrBits = paramStr.split("=", 2);
            String paramName = paramStrBits[0];
            String paramValue = paramStrBits[1];

            params.put(paramName, paramValue);
        }
    }

    public String getActionName() {
        return cmd.split("\\?", 2)[0];
    }

    public String getParam(String name, String defaultValue) {
        return params.getOrDefault(name, defaultValue);
    }
}
