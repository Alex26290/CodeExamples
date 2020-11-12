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
public class LoggingRequestHandler extends AbstractRequestHandler {
    public LoggingRequestHandler(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Request arrived: " + request);
        passToTheNext(request);
    }
}
