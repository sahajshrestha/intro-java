package com.athenahealth.java.workshop.partb;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface Patient {
    /**
     * Marks a patient as having checked in.
     * If the patient is already checked in, logs a message notifying them of their mistake
     */
    void checkIn();

    /**
     * Returns a list of symptoms.
     * For action symptoms that end in "ing", the explanation will read "I am " + symptom
     * For any other symptom, the explanation will read "I have a(n) " + symptom
     *
     * There must be no duplicate explanations
     * @return List of sentences describing symptoms
     */
    List<String> explainSymptoms();

    /**
     * If a patient has insurance, returns an Optional wrapping the insurance
     * If the patient does not have insurance, returns an empty Optional
     * @return Patient's insurance, if they have one
     */
    Optional<Insurance> provideInsurance();

    /**
     * Did I mention that you can provide default implementations of interface functions?
     * Consider this a reminder if I forgot!
     * @throws IOException
     */
    default void throwsException() throws IOException {
        throw new IOException("This is a caught exception. Handle it!");
    }
}
