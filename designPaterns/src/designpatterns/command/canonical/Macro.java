/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.command.canonical;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander
 */
public class Macro {
    private final List<Command> commands = new ArrayList<>();

    public void record(Command action) {
        commands.add(action);
    }

    public void run() {
        for (Command command : commands) {
            command.execute();
        }
    }
}