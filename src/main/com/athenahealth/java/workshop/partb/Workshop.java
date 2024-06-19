package com.athenahealth.java.workshop.partb;

import com.athenahealth.java.workshop.partb.solution.PatientExample;

import java.util.List;

/**
 * Goal of this workshop, play around with different code flow mechanics in Java!
 * Try out different kinds of Collections, iterate over those Collections in different ways, and do some Exception handling
 *
 * TODO
 * Make BetterPatient, implementing the Patient interface
 * Fill out the visitDoctor function
 * Make TestException compile, and uncomment the p.throwsException() without it blowing up
 */
public class Workshop {
    public static void main(String[] args) {
        List<Patient> patients = makePatients();
        visitDoctor(patients);
        testExceptions(patients.get(2));
    }

    /*
     */
    public static List<Patient> makePatients() {
        Insurance united = new Insurance(1, "UHG");
        Insurance blueCross = new Insurance(2, "BCBS");
        return List.of(
                makePatient(united, List.of("coughing", "fever")),
                makePatient(blueCross, List.of("forgetfulness", "headache", "forgetfulness")),
                makePatient(null, List.of("fever, and the only cure is more cowbell"))
        );
    }

    /**TODO
     * Swap from using PatientExample to BetterPatient
     * @param insurance
     * @param symptoms
     * @return
     */
    private static Patient makePatient(Insurance insurance, List<String> symptoms) {
        return new PatientExample(symptoms, insurance);
//        return new BetterPatient(symptoms, insurance);
    }

    /** TODO
     * For each patient, have them check in
     * For each patient, let them explain their symptoms
     * For each patient, print out their insurance name if they have one or uninsured if they are uninsured
     */
    private static void visitDoctor(List<Patient> patient) {
        // Fill this in!
    }

    /**
     * TODO Modify this function so that it doesn't stop the method execution
     * @param p
     */
    private static void testExceptions(Patient p) {
        // Note that this is flagged by IntelliJ!
        var insurance = p.provideInsurance().get();
        System.out.println(insurance.getName());
        assert(false);
        System.out.println("Null pointers sure are annoying");
        // TODO This won't compile if we uncomment it. Make it work!
//        p.throwsException();
    }
}
