/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command.moderncommand;

import designpatterns.command.canonical.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander
 */
public class ModernMacro {
    private final List<Command> commands = new ArrayList<>();

    public ModernMacro record(Command action) {
        commands.add(action);
        return this;
    }

    public void run() {
        commands.forEach(Command::execute);
    }
}