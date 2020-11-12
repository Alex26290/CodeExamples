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
public class NativeDigitCounter implements DigitCounter {
    @Override
    public int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}