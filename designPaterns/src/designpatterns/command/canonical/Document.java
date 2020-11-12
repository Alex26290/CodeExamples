/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command.canonical;

/**
 *
 * @author Alexander
 */
public class Document implements Editor {
    @Override
    public void bold() {
        System.out.println("Bold text...");
    }

    @Override
    public void italic() {
        System.out.println("Italic text...");
    }

    @Override
    public void underline() {
        System.out.println("Underline text...");
    }
}
