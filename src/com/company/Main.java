package com.company;


import com.company.domain.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // refactoring java 7 => 8

    public static void printNameAndAgeOfEveryStudent(List<Student> students) {
        students.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
    }


    // map - method reference
    public static List<Integer> getStudentAges(List<Student> students) {
        return students.stream()
                .map(Student::getAge)
                .collect(Collectors.toList());
    }

    // map
    public static List<Student> getMultiplyStudentAge(List<Student> students){
        return students.stream()
                .map(s -> new Student(s.getName(), s.getAge()*2, s.getGender(), s.getGrades(), s.getFavouriteSubject()))
                .collect(Collectors.toList());
    }

    // filter
    public static List<Student> getStudentsWithMinimumAge(List<Student> students, int minAge) {
        return students.stream().filter(s -> s.getAge() >= minAge).collect(Collectors.toList());
    }

    // filter and possible double method references
    public static List<Integer> getPrimeAges(List<Student> students) {
        return students.stream()
                .map(Student::getAge)
                .filter(Main::isPrime)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    // comparing (sorted)
    public static List<Integer> getSortedAges(List<Student> students) {
        return students.stream()
                .sorted(comparing(Student::getAge))
                .map(Student::getAge)
                .collect(Collectors.toList());
    }

    // count
    public static long countMaleStudents(List<Student> students) {
        return students.stream()
                .map(Student::getGender)
                .filter(g -> g == Gender.MALE)
                .count();
    }


    // average, orElse
    public static double avgAgeOfFemaleStudent(List<Student> students){
        return students.stream()
                .filter(s -> s.getGender() == Gender.FEMALE)
                .mapToInt(Student::getAge)
                .average()
                .orElse(0);
    }


    // reduce
    public static double productOfStudentGrades(Student student) {
        return student.getGrades()
                .stream()
                .mapToInt(value -> value.getType().getValue())
                .reduce(1, (a, b) -> a * b);
    }


    // sorted(default), findFirst
    public static Optional<Grade> getBestMathGradeFromStudent(Student student) {
        return student.getGrades().stream()
                .filter(g -> g.getSubject() == Subject.MATH)
                .sorted()
                .findFirst();
    }

    // anyMatch
    public static boolean atLeastOneGradeA(Student student){
        return student.getGrades().stream()
                .anyMatch(grade -> grade.getType() == GradeType.A);
    }


    // limit, IntStream.iterate, boxed
    public static List<Integer> getFirstPrimes(int howMany) {
        return IntStream.iterate(0, operand -> operand + 1)
                .filter(Main::isPrime)
                .limit(howMany)
                .boxed()
                .collect(Collectors.toList());
    }


}
