/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dssampletest;

/**
 * Node.java
 * N Varadi 
 * 15 03 2021
 *
 */

public class Node{ //inital setup for linked list

    //variables
    Student student;
    Node next;
    

    public Node(Student student, Node next) { //constructor, overloaded
        this.student = student;
        this.next = next;
    }

    public Node(Student student) { //constructor2, sets initial values to data members
        this(student, null);
    }

    //setter methods
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //getter methods
    public Student getStudent() {
        return student;
    }

    public Node getNext() {
        return next;
    }

    //method to print the content of each student object
    @Override
    public String toString() {
        return student.toString();
    }
}
