package com.athenahealth.java.workshop.partgradle;

/**
 * PRO-TIPS:
 *
 * SERIALIZATION:
 * There is often a need to convert java objects to string and string to java. More specifically,
 * serialization is converting the objects to byte stream so that it could be saved to a file, sent over a network,
 * stored in a database, etc.
 *
 * toString is one way to convert object to String but can't convert string to object
 * The third party app called Jackson is used for serialization
 *
 * Jacskon using ObjectMapper
 * ObjectMapper is the core class to convert objects to strings and back
 * .readValue (String, Class)
 * .wrtieValueAsString(Object)
 *
 * Jackson also provides annotations. For example, classes may have properties that we don't want or need to be serialized,
 * for example, user passwords because they should not be transmitted at all. @JsonIgnore is used in this case.
 * @JsonIgnore String socialSecurityNumber
 *
 * @JsonValue(String) - Serialize with an alias name
 */


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
