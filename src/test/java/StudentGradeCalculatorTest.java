

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeCalculatorTest {

    // Positive test cases

    @Test
    void testGradeA() {
        assertEquals("A", StudentGradeCalculator.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", StudentGradeCalculator.calculateGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals("C", StudentGradeCalculator.calculateGrade(75));
    }

    @Test
    void testGradeD() {
        assertEquals("D", StudentGradeCalculator.calculateGrade(65));
    }

    @Test
    void testGradeE() {
        assertEquals("E", StudentGradeCalculator.calculateGrade(45));
    }

    @Test
    void testGradeF() {
        assertEquals("F", StudentGradeCalculator.calculateGrade(30));
    }

    @Test
    void testMinimumMarks() {
        assertEquals("F", StudentGradeCalculator.calculateGrade(0));
    }

    @Test
    void testMaximumMarks() {
        assertEquals("A", StudentGradeCalculator.calculateGrade(100));
    }

    // Negative test cases

    @Test
    void testNegativeMarks() {
        assertThrows(IllegalArgumentException.class,
            () -> StudentGradeCalculator.calculateGrade(-1));
    }

    @Test
    void testMarksAboveHundred() {
        assertThrows(IllegalArgumentException.class,
            () -> StudentGradeCalculator.calculateGrade(101));
    }
}
