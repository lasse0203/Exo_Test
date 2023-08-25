package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

    public class CityFindTest {

        private CityFind cityFind;



        @BeforeEach
        public void setUp() {
            cityFind = new CityFind();
        }

        @Test
        public void testFindLessThan2Characters() {
            assertThrows(NotFoundException.class, () -> cityFind.findCities(""));
            assertThrows(NotFoundException.class, () -> cityFind.findCities("A"));
        }

        @Test
        public void testFindMatchCharacters() {
            List<String> results = cityFind.findCities("Va");
            assertEquals(2, results.size());
            assertTrue(results.contains("Valence"));
            assertTrue(results.contains("Vancouver"));
        }

        @Test
        public void testFindSensitiveCase() {
            List<String> results = cityFind.findCities("bud");
            assertEquals(1, results.size());
            assertTrue(results.contains("Budapest"));
        }

        @Test
        public void testFindByCharacters() {
            List<String> results = cityFind.findCities("ape");
            assertEquals(1, results.size());
            assertTrue(results.contains("Budapest"));
        }

        @Test
        public void testFindAllCities() {
            List<String> results = cityFind.findCities("*");
            assertEquals(16, results.size());
            assertTrue(results.contains("Paris"));
            assertTrue(results.contains("Budapest"));
            assertTrue(results.contains("Skopje"));
            assertTrue(results.contains("Rotterdam"));
            assertTrue(results.contains("Valence"));
            assertTrue(results.contains("Vancouver"));
            assertTrue(results.contains("Amsterdam"));
            assertTrue(results.contains("Vienne"));
            assertTrue(results.contains("Sydney"));
            assertTrue(results.contains("NewYork"));
            assertTrue(results.contains("Bangkok"));
            assertTrue(results.contains("Hong Kong"));
            assertTrue(results.contains("Dubaï"));
            assertTrue(results.contains("Rome"));
            assertTrue(results.contains("Istanbul"));
        }
    }
