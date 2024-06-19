package com.athenahealth.java.workshop.partb;

import java.io.IOException;

public class Insurance {
    final String name;
    final int federalId;

    public Insurance(int federalId, String name) {
        this.federalId = federalId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getFederalId() {
        return federalId;
    }
}
