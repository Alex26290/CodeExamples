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
public class DecoratorClient {
    public static void main(String[] args) {
        DigitCounter counter = new BenchmarkingDigitCounter(new NativeDigitCounter());
        int digitsCount = counter.count("fd6j78fh19kj");
        System.out.println(digitsCount + " digits found");
    }
}
