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
public class BoldCommand implements Command {
    private final Editor editor;

    public BoldCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.bold();
    }
}

