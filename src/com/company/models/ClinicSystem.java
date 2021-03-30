package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class ClinicSystem {
    public String name;
    private List<Patient> patients;

    public List<MedicalStaff> medicalStaffs;
    public List<Department> departments;

    public ClinicSystem(String name) {
        this.name = name;
        this.patients = new ArrayList<Patient>();
        this.medicalStaffs = new ArrayList<MedicalStaff>();
        this.departments = new ArrayList<Department>();
    }

    public void updatePatients(Patient patient){
        this.patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added");
    }

}
