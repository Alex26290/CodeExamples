/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter.canonical;

import java.util.concurrent.Executor;
import java.util.function.Consumer;

/**
 *
 * @author Alexander
 */
public class ExecutorConsumerAdapter implements Consumer<Runnable> {
    private final Executor executor;

    public ExecutorConsumerAdapter(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void accept(Runnable task) {
        executor.execute(task);
    }
}
