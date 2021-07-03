/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dssampletest;

/**
 * StudentApp.java
 * N Varadi
 * 15 03 2021
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        
        LinkedList students = new LinkedList();

        Student s1 = new Student(25436485, 3050, "Abubakr Siddig", "abubakr.siddig@ncirl.ie", "Active", "International");
        students.add(s1);

        Student s2 = new Student(12345678, 2100, "Mary Cullen", "mary.cullen@ncirl.ie", "Active", "Irish");
        students.add(s2);

        Student s3 = new Student(87654321, 3200, "Anita Pallenberg", "anita.pallenberg@ncirl.ie", "Suspended", "EU");
        students.add(s3);

        Student s4 = new Student(87675479, 4500, "James Butler", "james.butler@ncirl.ie", "Active", "International");
        students.add(s4);

        Student s5 = new Student(89234565, 2200, "Mark Schumacher", "mark.schumacher@ncirl.ie", "Suspended", "EU");
        students.add(s5);
        
        Student s6 = new Student(89234567, 2800, "Martin Evans", "martin.evans@ncirl.ie", "Active", "Irish");
        students.addAfter(s6);
        
        System.out.println(students.isEmpty());
        System.out.println(students.toString());
        System.out.println(s1.toString());
        System.out.println(students.get_status(89234));
        students.remove(25436485); //void type method, don't call it inside system.out!!!
        System.out.println(students.toString());
        System.out.println(students.getAverageFee());
        
        System.out.println(students.remove("active"));
        System.out.println(students.toString());
        System.out.println(students.getAverageFee());
        
       
    }
}
