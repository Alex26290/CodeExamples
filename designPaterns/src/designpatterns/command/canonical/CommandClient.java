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
public class CommandClient {
    public static void main(String[] args) {
        Document editor = new Document();

        Macro macro = new Macro();
        macro.record(new BoldCommand(editor));
        macro.record(new ItalicCommand(editor));
        macro.record(new UnderlineCommand(editor));
        macro.run();
    }
}
