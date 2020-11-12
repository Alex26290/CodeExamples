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
public class FactoryMethodClient {
    public static void main(String[] args) {
        DocumentFactory factory = new JsonDocumentFactory();
        Document document = factory.create("USER");
        document.addField("name", "Mikalai");
        document.addField("surname", "Alimenkou");
        System.out.println(document);
    }
}
