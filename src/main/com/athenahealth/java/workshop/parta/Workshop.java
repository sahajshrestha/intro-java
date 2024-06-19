package com.athenahealth.java.workshop.parta;

/** TODO
 * First, follow the instructions on the objectCreation comment
 * Then, uncomment equality from the main function and play around with it
 * Finally, check out how staticExample invokes a static call, and how it can take in an implementation of Person
 * without requiring any specific code changes
 */
public class Workshop {
    public static void main(String[] args) {
        objectCreation();
//        equality(); // Uncomment once objectCreation is working
        staticExample();
    }

    /**
     * Part 1 is to build a Person class called BetterPerson
     * Your Person must have a name, an age, a hospitalId, a weight, and a flag whether or not they are checked in.
     * Each variable should have an associated getter and setter.
     * Create two constructors: a constructor that just takes in their name, and one that takes in every possible value
     */
    public static void objectCreation() {
        PersonExample example = new PersonExample("Tyler");
//        BetterPerson example = new BetterPerson("you!");
        example.setAge(21);
        example.setWeight(123.4);
        assert("Tyler".equals(example.getName())); // Rule of thumb: compare constants to variables
        assert(example.getAge() == 21);
        assert(example.getWeight() == 123.4);
        assert(example.getHospitalId() == null);
        assert(!example.isCheckedIn());
    }

    /**
     * Make an equals function that compares all the properties of the BetterPerson class
     */
    public static void equality() {
        PersonExample thing1 = new PersonExample("Tyler");
        PersonExample thing2 = new PersonExample("Tyler");
//        BetterPerson thing1 = new BetterPerson("Tyler");
//        BetterPerson thing2 = new BetterPerson("Tyler");
        thing1.setAge(1);
        thing2.setAge(2);
        thing1.setWeight(123.4);
        thing2.setWeight(123.4);
        assert(thing1 != thing2); // comparing objects with == compares their heap address
        assert(thing1.equals(thing2)); // This uses the equals method defined on the class... which is heap address by default
    }

    public static void staticExample(){
        PersonExample person = new PersonExample("Tyler");
//        BetterPerson person = new BetterPerson("Tyler");
        var who = PersonParser.whoIsThis(person);
        System.out.println(who);
    }
}
