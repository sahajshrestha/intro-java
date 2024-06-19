package com.athenahealth.java.workshop.partb.solution;

import com.athenahealth.java.workshop.partb.Insurance;
import com.athenahealth.java.workshop.partb.Patient;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PatientExample implements Patient {
    Set<String> symptoms;
    Insurance insurance;
    boolean checkedIn = false;

    public PatientExample(Collection<String> symptoms, Insurance insurance) {
        this.symptoms = Set.copyOf(symptoms);
        this.insurance = insurance;
    }

    @Override
    public void checkIn() {
        if (checkedIn) {
            System.out.println("You already checked in, you goof!");
        }
        checkedIn = true;
    }

    @Override
    public List<String> explainSymptoms() {
        return symptoms.stream().map(symptom -> {
            if (symptom.endsWith("ing")) {
                return "I am " + symptom;
            } else {
                return "I have a(n) " + symptom;
            }
        }).toList();
    }

    @Override
    public Optional<Insurance> provideInsurance() {
        return Optional.ofNullable(insurance);
    }
}
