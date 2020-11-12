/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factorymethod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Alexander
 */
public class JsonDocument implements Document {
    private final String name;
    private final Map<String, String> fields = new LinkedHashMap<>();

    public JsonDocument(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addField(String name, String value) {
        fields.put(name, value);
    }

    @Override
    public String toString() {
        return fields.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .collect(Collectors.joining(",\n", "{\n", "\n}"));
    }
}
