/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dssampletest;

/**
 * LinkedList.java N Varadi 15 03 2021
 *
 */
public class LinkedList implements List {

    private Node first; //reference to first node
    private Node last; //reference to last node

    public LinkedList() { //constructor, initial values to variables
        first = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {//methods checks if linked list is empty
        return first == null;
    }

    @Override
    public void add(Student student) {//method will add new element to the beginning of the linked list
        Node insertion = new Node(student, first);//create new node

        if (isEmpty()) {//if linked list is empty
            // first addition
            last = insertion;
        }
        //if linked list is not empty
        first = insertion;//new node will go to the front of the linked list
    }

    @Override
    public void addAfter(Student student) {//adds new node at the end of linked list

        if (isEmpty()) {//if the linked list is empty
            first = new Node(student); //new node will be the first one
            last = first;//last node is the same as first one
        }
        //if the linked list is not empty
        last.next = new Node(student);//new node will be placed after the last one
        last = last.next;//new node is the new last node in the list
    }

    @Override
    public String remove(int studentNumber) {//removes first occurrence of target
        Node current = first;//reference to the first element in linked list
        Node previous = null;
        int counter = 0;

        if (isEmpty()) {//if the linked list is empty
            return "There are no students in the linked list"; //provide an appropriate message
        }

        while (current != null) {//if we are not at the end of linked list
            Student student = current.student; //keep iterating the linked list           
            counter++;//count the nodes while iterating

            if (counter == size()) {//if we reach the end of the list without a match
                return "Student not found";//provide appropriate message
            }

            if (student.getStudentNumber() == studentNumber) {//when we find the matching studentNumber

                if (current.equals(first)) {//if the found target element is the first one in the linked list
                    first = current.next;//re-assign first element to point the the next element in the linked list
                } else {//if the target element is not the first one in the linked list
                    previous.next = current.next; //remove target by re-assigning previous reference to the element following out target
                }

                // stop after first occurrence
                return "Student removed ";
            }

            previous = current;//re-assign reference to previous element to the current one
            current = current.next;//move reference to current element to the next one
        }
        return "Student removed";
    }

    @Override
    public String get_status(int studentNumber) {//find the status of the target node, identified by studentNumber
        Node current = first; //a reference to the first element
        String status = null;//default value to status variable is null
        int counter = 0;

        if (isEmpty()) {//if the linked list is empty
            return "There are no students in the linked list"; //provide an appropriate message
        }

        while (current != null) {//iterate linked list until we reach the end of lsit
            Student student = current.student;
            counter++;

            if (counter == size()) {//if we reach the end of the list without a match
                return "Student not found";//provide appropriate message
            }

            if (student.getStudentNumber() == studentNumber) {//where studentNumber matches
                return student.getStatus(); //return the status value of the element
            }
            current = current.next;
        }

        return status;
    }

    @Override
    public String toString() { //display the content of the linked list
        String str = "Start --\n"; //create string to hold content of list
        Node current = first; //assign a reference to point to first element

        while (current != null) { //as long as reference is NOT pointing to the last element
            str = str + current.getStudent() + "\n"; //add current element into the string
            current = current.getNext();//move on to the next element
        }

        str = str + "\n End--";

        return str; //when loop terminates, return string
    }

    public Node getFirst() {//returns the first element in the linked list
        return first;
    }

    public Node getLast() {//returns the last element in the linked list
        return last;
    }

    @Override
    public int size() {//returnst the count of the elements in the linked list
        int count = 0; //variable to save the count into
        Node p = first; //a reference, pointing to the first element

        while (p != null) {//as long as reference is NOT pointing to the last element
            count++; //increase counter by 1 at each iteration
            p = p.next; //move reference to next element
        }
        return count; //when loop terminates, return the value saved in count variable       
    }

    @Override
    public double getAverageFee() {//method calculates the average fee students paid
        Node current = first;//reference to the first node
        double averageFee = 0.0;//variable that holds the required result
        double totalFees = 0.0;//variable that holds the total amount of fee paid by all students

        while (current != null) {//iterate through the linked list
            Student student = current.student;
            totalFees = totalFees + student.getAnnualFees();
            current = current.next;
            averageFee = totalFees / size();//calculate result, re-using size() method
        }
        return averageFee;
    }

    @Override
    public String remove(String status) {
        Node current = first;//reference to the first element in linked list
        Node previous = null;
        int counter = 0;

        if (isEmpty()) {
            return "There are no students in the linked list";
        }

        while (current != null) {//if we are not at the end of linked list
            Student student = current.student; //keep iterating the linked list
            counter++;

            if (counter == size()) {
                return "Student not found";
            }

            if (student.getStatus().equalsIgnoreCase(status)) {//when we find the matching studentNumber

                if (current.equals(first)) {//if the found target element is the first one in the linked list
                    first = current.next;//re-assign first element to point the the next element in the linked list
                } else {//if the target element is not the first one in the linked list
                    previous.next = current.next; //remove target by re-assigning previous reference to the element following out target
                }

                // stop after first occurrence
                return "Student removed";
            }

            previous = current;//re-assign reference to previous element to the current one
            current = current.next;//move reference to current element to the next one
        }
        return "Student removed";
    }

}
