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
public class ChainClient {
    public static void main(String[] args) {
        Request request = new Request(5);
        RequestHandler handler = new AuthRequestHandler(new LoggingRequestHandler(null));
        handler.handleRequest(request);
    }
}
