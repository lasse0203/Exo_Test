package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemTest {

    private System system;
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
        public void testCarDecrement() {
            Car car = new Car(5, 80);
            car.dailyRoutine();
            assertEquals(4, car.getRentDueIn());
            assertEquals(79, car.getCondition());
        }

        @Test
        public void testNeverNegative() {
            Car car = new Car(3, 0);
            car.dailyRoutine();
            assertEquals(2, car.getRentDueIn());
            assertEquals(0, car.getCondition());
        }

        @Test
        public void testNeverAbove100() {
            Car car = new Car(7, 110);
            car.dailyRoutine();
            assertEquals(6, car.getRentDueIn());
            assertEquals(100, car.getCondition());
        }


    }


