package com.back;


import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Rq {
    private final String cmd;
    private final Map<String, String> params;

    public Rq(String cmd) {
        this.cmd = cmd;
        String queryString = cmd.split("\\?", 2)[1];
        params = Arrays
                .stream(queryString.split("&"))
                .map(e -> e.split("=", 2))
                .collect(Collectors.toMap(e -> e[0], e -> e[1]));
    }

    public String getActionName() {
        return cmd.split("\\?", 2)[0];
    }

    public String getParam(String name, String defaultValue) {
        return params.getOrDefault(name, defaultValue);
    }
}
