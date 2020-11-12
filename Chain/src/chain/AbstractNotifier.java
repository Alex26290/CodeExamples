/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author Alexander
 */
public abstract class AbstractNotifier implements Notifier {

    public int priority;
    public Handler nextHandler;

    public AbstractNotifier(int priority) {
        this.priority = priority;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = (Notifier) nextHandler;
    }

    @Override
    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextHandler != null) {
            ((Notifier) nextHandler).notifyManager(message, level);
        }
    }

    public void write(String message) {
    }
}
