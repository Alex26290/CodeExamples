/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.chain.canonical;

/**
 *
 * @author Alexander
 */
public class AuthRequestHandler extends AbstractRequestHandler {
    private static final ThreadLocal<Long> currentUser = new ThreadLocal<>();

    public AuthRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        currentUser.set(request.getUserId());
        System.out.println("Current user is set to: " + request.getUserId());
        request.addParam("AUTH_PASSED", "TRUE");
        passToTheNext(request);
    }

    public static Long getCurrentUser() {
        return currentUser.get();
    }
}
