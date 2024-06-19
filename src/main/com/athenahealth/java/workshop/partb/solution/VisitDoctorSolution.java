package com.athenahealth.java.workshop.partb.solution;

import com.athenahealth.java.workshop.partb.Insurance;
import com.athenahealth.java.workshop.partb.Patient;

import java.util.List;

public class VisitDoctorSolution {
    public static void visitDoctor(List<Patient> patients) {
        for (Patient patient : patients) {
            patient.checkIn();
            System.out.println(String.join("Oh, and... ", patient.explainSymptoms()));
            System.out.println(patient.provideInsurance().map(Insurance::getName).orElse("Uninsured"));
        }
        //oops
        patients.get(0).checkIn();
    }
}
