/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.chain.modernchain;

import designpatterns.chain.canonical.Request;
import java.util.function.Consumer;

/**
 *
 * @author Alexander
 */
public class ModernAuthRequestHandler implements Consumer<Request> {
    private static final ThreadLocal<Long> currentUser = new ThreadLocal<>();

    @Override
    public void accept(Request request) {
        currentUser.set(request.getUserId());
        System.out.println("Current user is set to: " + request.getUserId());
        request.addParam("AUTH_PASSED", "TRUE");
    }

    public static Long getCurrentUser() {
        return currentUser.get();
    }
}
