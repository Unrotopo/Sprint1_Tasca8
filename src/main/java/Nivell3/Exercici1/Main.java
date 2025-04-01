package Nivell3.Exercici1;

import Nivell3.Exercici1.entities.Student;
import Nivell3.Exercici1.filters.StudentFilters;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Laia", 27, "PHP", 7));
        students.add(new Student("Pere", 42, "JAVA", 6));
        students.add(new Student("Johnny", 17, "JAVA", 5));
        students.add(new Student("Zeltia", 36, "PHP", 9));
        students.add(new Student("Angeles", 16, "JAVA", 8));
        students.add(new Student("Gerardo", 61, "DATA", 4));
        students.add(new Student("Ana", 17, "JAVA", 7));
        students.add(new Student("Uri", 21, "DATA", 9));
        students.add(new Student("Roman", 30, "PHP", 3));
        students.add(new Student("Luis", 37, "JAVA", 7));

        StudentFilters studentFilters = new StudentFilters();

        System.out.println("\n\nStudents with names that start with A:");
        studentFilters.studentNamedA(students).forEach(System.out::println);


        System.out.println("\n\nStudents with grade 5 or higher:");
        studentFilters.studentPassed(students).forEach(System.out::println);


        System.out.println("\n\nStudents with grade 5 or higher and do not course PHP:");
        studentFilters.studentPassNotPHP(students).forEach(System.out::println);


        System.out.println("\n\nStudents that are adults and study JAVA:");
        studentFilters.studentPassNotJava(students).forEach(System.out::println);
    }
}
