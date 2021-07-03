/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dssampletest;

/**
 * List.java
 * N Varadi
 * 15 03 2021
 *
 */
public interface List{

    public boolean isEmpty();//checks if there's any object present in the linked list

    public String get_status(int studentNumber); //returns the status of the target student object, defined by student number

    public void add(Student student); //method will add new student object at the start of the linked list

    public String remove(int studentNumber); //remove a specified student, defined by student number

    public double getAverageFee();//calculates the average fee paid by the students
    
    public int size();//counts the number of nodes in the linked list
    
    public String remove(String status);//removes a student based on its status
    
    public void addAfter(Student student);//adds a new node after the last node in the linked list
}
