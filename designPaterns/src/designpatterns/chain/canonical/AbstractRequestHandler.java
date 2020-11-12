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
public abstract class AbstractRequestHandler implements RequestHandler {
    private final RequestHandler next;

    public AbstractRequestHandler(RequestHandler next) {
        this.next = next;
    }

    protected void passToTheNext(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
