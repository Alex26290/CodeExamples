/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.adapter.canonical;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Alexander
 */
public class CharCounterTask implements Runnable {
    private final String str;
    private final AtomicInteger counter;

    public CharCounterTask(String str, AtomicInteger counter) {
        this.str = str;
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.addAndGet(str.length());
    }
}