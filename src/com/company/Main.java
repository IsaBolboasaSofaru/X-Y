package com.company;

import com.company.models.ClinicSystem;
import com.company.models.Patient;

public class Main {

    public static void main(String[] args) {

        System.out.println("Aici");

        ClinicSystem clinicSystem = new ClinicSystem("Aici 2");
        System.out.println(clinicSystem.name);

        Patient adrian = new Patient("Adrian", 22);
        clinicSystem.updatePatients(adrian);

    }
}
