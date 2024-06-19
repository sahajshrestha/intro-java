package com.athenahealth.java.workshop.partgradle;

/**
 * TODO
 * Make a new module (File -> New -> Module)
 * Name it whatever you feel like
 * Choose Maven or Gradle as the build system (I'd choose gradle but it really doesn't matter)
 *
 * Add Jackson as a dependency in the build.gradle file (or pom.xml if using Maven)
 * Group id = com.fasterxml.jackson.core
 * Artifact id = jackson-databind
 * Version = 2.17.0 (or find the most recent version on maven central)
 *
 * Copy the main function from down below into your Main function in the new module
 *
 * Make it work!
 */
public class Workshop {
    //TODO Move this to your new Gradle module based on
    /*
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        var deserialized = mapper.readValue("{\"age\": 33, \"name\": \"Derek Zoolander\"}", PatientRecord.class);
        var expectedPatient = new PatientRecord(33, "Derek Zoolander");
        assert(expectedPatient.equals(deserialized));
        System.out.println("Woah, it worked!");
    }
     */
}
