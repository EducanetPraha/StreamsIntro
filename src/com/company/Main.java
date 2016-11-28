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
    }


    // map - method reference
    public static List<Integer> getStudentAges(List<Student> students) {

    }

    // map
    public static List<Student> getMultiplyStudentAge(List<Student> students){

    }

    // filter
    public static List<Student> getStudentsWithMinimumAge(List<Student> students, int minAge) {
    }

    // filter and possible double method references
    public static List<Integer> getPrimeAges(List<Student> students) {

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

    }

    // count
    public static long countMaleStudents(List<Student> students) {

    }


    // average, orElse
    public static double avgAgeOfFemaleStudent(List<Student> students){

    }


    // reduce
    public static double productOfStudentGrades(Student student) {

    }


    // sorted(default), findFirst
    public static Optional<Grade> getBestMathGradeFromStudent(Student student) {

    }

    // anyMatch
    public static boolean atLeastOneGradeA(Student student){

    }


    // limit, IntStream.iterate, boxed
    public static List<Integer> getFirstPrimes(int howMany) {

    }


}
