/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.builder.canonicalbuilder;

/**
 *
 * @author Alexander
 */
public class BuilderClient {

    public static void main(String[] args) {
        Cluster cluster = Cluster.runtimeBuilder()
                .addContactPoints("localhost").withPort(3165)
                .withRetryAttempts(3)
                .withoutMetrics().build();

        cluster = Cluster.storingBuilder()
                .addContactPoints("localhost").withPort(3165)
                .withRetryAttempts(3)
                .withoutMetrics().build();
    }

}
