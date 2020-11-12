/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.decorator;

/**
 *
 * @author Alexander
 */
public class BenchmarkingDigitCounter implements DigitCounter {
    private final DigitCounter delegate;

    public BenchmarkingDigitCounter(DigitCounter delegate) {
        this.delegate = delegate;
    }

    @Override
    public int count(String str) {
        long startTime = System.currentTimeMillis();
        int count = delegate.count(str);
        long endTime = System.currentTimeMillis();
        System.out.println("Counting took " + (endTime - startTime) + " ms");
        return count;
    }
}
