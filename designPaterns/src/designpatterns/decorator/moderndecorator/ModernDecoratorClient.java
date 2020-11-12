/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.decorator.moderndecorator;

import designpatterns.decorator.DigitCounter;
import designpatterns.decorator.NativeDigitCounter;
import java.util.function.Function;

/**
 *
 * @author Alexander
 */
public class ModernDecoratorClient {
    public static void main(String[] args) {
        DigitCounter counter = wrap(new NativeDigitCounter());
        int digitsCount = counter.count("fd6j78fh19kj");
        System.out.println(digitsCount + " digits found");

        digitsCount = ((Function<String, String>) String::trim)
                .andThen(new NativeDigitCounter()::count)
                .apply(" \n 123 \t");
        System.out.println(digitsCount + " digits found");
    }

    public static DigitCounter wrap(DigitCounter counter) {
        return s -> {
            long startTime = System.currentTimeMillis();
            int count = counter.count(s);
            long endTime = System.currentTimeMillis();
            System.out.println("Counting took " + (endTime - startTime) + " ms");
            return count;
        };
    }
}
