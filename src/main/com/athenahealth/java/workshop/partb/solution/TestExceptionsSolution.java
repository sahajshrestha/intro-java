package com.athenahealth.java.workshop.partb.solution;

import com.athenahealth.java.workshop.partb.Patient;

import java.io.IOException;

public class TestExceptionsSolution {
    private static void testException(Patient p) {
        try {
            // Note that this is flagged by IntelliJ!
            var insurance = p.provideInsurance().get();
            System.out.println(insurance.getName());
            assert (false);
            p.throwsException();
        } catch (NullPointerException ex) {
            //whew, caught that nasty NPE!
        } catch (IOException e) {
            System.out.println("I avoided the NPE, but still couldn't finish the method unscathed...");
        }
        System.out.println("Null pointers sure are annoying");
    }
}
