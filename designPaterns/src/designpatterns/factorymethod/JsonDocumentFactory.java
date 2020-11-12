/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.factorymethod;

/**
 *
 * @author Alexander
 */
public class JsonDocumentFactory implements DocumentFactory {
    @Override
    public Document create(String name) {
        return new JsonDocument(name);
    }
}
