package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GradingCalculatorTest {
    // méthode pour faciliter le travail:
    /*GradingCalculator calculator;
    private void initGradingCalculator(int score, int attendance){
        GradingCalculator calculator = new GradingCalculator();
        calculator.setScore(score);
        calculator.setAttendancePercentage(attendance);

    }*/
        @Test
        public void testGradeA() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(95);
            calculator.setAttendancePercentage(90);
            assertEquals('A', calculator.getGrade());
        }

        @Test
        public void testGradeB() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(85);
            calculator.setAttendancePercentage(90);
            assertEquals('B', calculator.getGrade());
        }

        @Test
        public void testGradeC() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(65);
            calculator.setAttendancePercentage(90);
            assertEquals('C', calculator.getGrade());
        }
        @Test
         public void testGradeBnewScore() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(95);
            calculator.setAttendancePercentage(65);
            assertEquals('B', calculator.getGrade());
        }
        @Test
        public void testGradeF() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(95);
            calculator.setAttendancePercentage(55);
            assertEquals('F', calculator.getGrade());
        }
        @Test
        public void testGradeFScore() {
            GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(65);
            calculator.setAttendancePercentage(55);
            assertEquals('F', calculator.getGrade());
        }
        @Test
         public void testGradeFnewScore() {
             GradingCalculator calculator = new GradingCalculator();
            calculator.setScore(50);
            calculator.setAttendancePercentage(90);
            assertEquals('F', calculator.getGrade());
        }
    }



