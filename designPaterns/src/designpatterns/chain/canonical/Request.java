/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.chain.canonical;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alexander
 */
public class Request {
    private final long userId;
    private final Map<String, String> params = new HashMap<>();

    public Request(long userId) {
        this.userId = userId;
    }

    public Request addParam(String name, String value) {
        params.put(name, value);
        return this;
    }

    public long getUserId() {
        return userId;
    }

    public Map<String, String> getParams() {
        return params;
    }

    @Override
    public String toString() {
        return "Request{userId=" + userId + ", params=" + params + "}";
    }
}
