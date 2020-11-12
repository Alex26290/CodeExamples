/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.chain.modernchain;

import designpatterns.chain.canonical.Request;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author Alexander
 */
public class ModernChainClient {
    public static void main(String[] args) {
        Request request = new Request(5);
        chain(new ModernAuthRequestHandler(), ModernChainClient::log)
                .accept(request);
    }

    @SafeVarargs
    public static Consumer<Request> chain(Consumer<Request>... handlers) {
        return Stream.of(handlers)
                .reduce(Consumer::andThen)
                .get();
    }

    private static void log(Request request) {
        System.out.println("Request arrived: " + request);
    }
}