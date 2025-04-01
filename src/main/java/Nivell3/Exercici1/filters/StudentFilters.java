package Nivell3.Exercici1.filters;

import Nivell3.Exercici1.entities.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentFilters {

    public List<Student> studentNamedA(List<Student> students) {
        return students.stream()
                .filter(student -> {
                    if (student.getName().charAt(0) == 'A') {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Student> studentPassed(List<Student> students) {
        return students.stream()
                .filter(student -> {
                    if (student.getGrade() >= 5) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Student> studentPassNotPHP(List<Student> students) {
        return students.stream()
                .filter(student -> {
                    if (student.getGrade() >= 5 && !student.getCourse().equals("PHP")) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Student> studentPassNotJava(List<Student> students) {
        return students.stream()
                .filter(student -> {
                    if (student.getAge() >= 18 && student.getCourse().equals("JAVA")) {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}
