/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dssampletest;

/**
 * Student.java
 * N Varadi
 * 15 03 2021
 */

public class Student { //an instantiable class, defining data members, constructor, setter and getter methods

    //data members
    private int studentNumber;
    private int annualFees;
    private String studentName;
    private String contactEmail;
    private String status;
    private String type;

    public Student(int studentNumber, int annualFees, String studentName, String contactEmail, String status, String type) {
        this.studentNumber = studentNumber;
        this.annualFees = annualFees;
        this.studentName = studentName;
        this.contactEmail = contactEmail;
        this.status = status;
        this.type = type;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setAnnualFees(int annualFees) {
        this.annualFees = annualFees;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public int getAnnualFees() {
        return annualFees;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        String result = getStudentNumber() + ", "
                + getAnnualFees() + ", "
                + getStudentName() + ", "
                + getContactEmail() + ", "
                + getStatus() + ", "
                + getType();

        return result;
    }
}
