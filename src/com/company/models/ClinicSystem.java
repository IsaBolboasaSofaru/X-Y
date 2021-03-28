package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class ClinicSystem {
    public String name;
    private List<Patient> patients;

    public ClinicSystem(String name) {
        this.name = name;
        this.patients = new ArrayList<Patient>();
    }

    public void updatePatients(Patient patient){
        this.patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added");
    }

}
