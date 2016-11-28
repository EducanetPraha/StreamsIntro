package com.company;

import com.company.domain.MockDataProvider;
import com.company.domain.School;

import static org.junit.Assert.*;

/**
 * Created by semantier on 11/28/2016.
 */
public class MainTest {

    School school;

    @org.junit.Before
    public void setUp() throws Exception {
        school = MockDataProvider.getNewSchool();
    }

    @org.junit.Test
    public void printNameAndAgeOfEveryStudent() throws Exception {
        // cannot test side-effects
    }

    @org.junit.Test
    public void getStudentAges() throws Exception {

    }

    @org.junit.Test
    public void getMultiplyStudentAge() throws Exception {

    }

    @org.junit.Test
    public void getStudentsWithMinimumAge() throws Exception {

    }

    @org.junit.Test
    public void getPrimeAges() throws Exception {

    }

    @org.junit.Test
    public void getSortedAges() throws Exception {

    }

    @org.junit.Test
    public void countMaleStudents() throws Exception {

    }

    @org.junit.Test
    public void avgAgeOfFemaleStudent() throws Exception {

    }

    @org.junit.Test
    public void productOfStudentGrades() throws Exception {

    }

    @org.junit.Test
    public void getBestMathGradeFromStudent() throws Exception {

    }

    @org.junit.Test
    public void atLeastOneGradeA() throws Exception {

    }

    @org.junit.Test
    public void getFirstPrimes() throws Exception {

    }

}