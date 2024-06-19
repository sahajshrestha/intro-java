package com.athenahealth.java.workshop.parta;

import java.util.Objects;

public class PersonExample implements Person {
    private String name;
    private int age;
    private Integer hospitalId;
    private double weight;
    private boolean checkedIn;

    public PersonExample(String name) {
        this(name, 0, null, 0.0, false);
    }

    public PersonExample(String name, int age, Integer hospitalId, double weight, boolean checkedIn) {
        this.name = name;
        this.age = age;
        this.hospitalId = hospitalId;
        this.weight = weight;
        this.checkedIn = checkedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonExample that = (PersonExample) o;
        return age == that.age && Double.compare(that.weight, weight) == 0 && checkedIn == that.checkedIn && Objects.equals(name, that.name) && Objects.equals(hospitalId, that.hospitalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hospitalId, weight, checkedIn);
    }
}
