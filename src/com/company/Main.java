package com.company;


import com.company.models.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //ArrayList<String> departmentNames = new ArrayList<>()["Cardiologie", "Stomatologie", "Generala", "Neurologie"];
        String[] departmentNames = {"Cardiologie", "Stomatologie", "Generala", "Neurologie"};
        // Lista de rooms
        List<Department> departments = new ArrayList<Department>();

        for(int departNr = 0; departNr < 4; ++departNr) {
            ArrayList<Room> roomsList = new ArrayList<Room>();
            for(int roomId = 0; roomId < 5; ++roomId){
                Room room = new Room();
                roomsList.add(room);
            }
            Department department = new Department(departmentNames[departNr], roomsList);
            departments.add(department);
        }


        ClinicSystem clinicSystem = new ClinicSystem("Aici 2");
        System.out.println(clinicSystem.name);

        //
        Patient adrian = new Patient("Adrian", 22);
        clinicSystem.updatePatients(adrian);

       // Doctor d = new Doctor(1, "abc", "a", "b", "b", "DOc");
       // clinicSystem.medicalStaffs.add(d);
        //System.out.println(clinicSystem.medicalStaffs.get(0).getFirstName());
        //add a new doctor to the clinic


    }
}
