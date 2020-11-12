/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command.moderncommand;

import designpatterns.command.canonical.Document;

/**
 *
 * @author Alexander
 */
public class ModernCommandClient {
    public static void main(String[] args) {
        Document editor = new Document();
        ModernMacro macro = new ModernMacro();

        macro.record(editor::bold)
                .record(editor::italic)
                .record(editor::underline)
                .run();
    }
}
