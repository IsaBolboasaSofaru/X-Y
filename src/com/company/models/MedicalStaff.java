package com.company.models;

public class MedicalStaff {
    static Integer staffMembersCounter = 0;
    // te (x^2 + y^2 + 1)^3 - x^2y^3=0
    // noapte buna:*
    //mereu
    protected Integer staffId;
    protected String typeOfJob;
    protected Department department;
    protected String address;
    protected Double salary;

    public MedicalStaff(String typeOfJob, String address){

        this.typeOfJob = typeOfJob;
        this.staffId = staffMembersCounter;
        staffMembersCounter += 1;

        if(this.typeOfJob == "Doctor"){
            this.salary = 200.0;
        }
    }

    public String getTypeOfJob() {
        return typeOfJob;
    }

    public void setTypeOfJob(String typeOfJob) {
        this.typeOfJob = typeOfJob;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}