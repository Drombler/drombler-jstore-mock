package org.drombler.jstore.mock;

import ch.sbb.esta.openshift.gracefullshutdown.GracefulshutdownSpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JStoreMockApp {

    public static void main(String[] args) {
        GracefulshutdownSpringApplication.run(JStoreMockApp.class, args);
    }
}
