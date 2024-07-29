package test.java.dev.aitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person1 = new Person("Pepe", "Cosmen", "3123-A", 2013, "Spain", 'M');
    Person person2 = new Person("David", "Goggins", "4156-B", 1983, "USA", 'M');


    @Test
    void testFirstName() {
        assertEquals("Pepe", person1.getFirstName());
        assertEquals("David", person2.getFirstName());
    }

    @Test
    void testLastName() {
        assertEquals("Cosmen", person1.getLastName());
        assertEquals("Goggins", person2.getLastName());
    }
    
    @Test
    void testIdNumber() {
        assertEquals("3123-A", person1.getIdNumber());
        assertEquals("4156-B", person2.getIdNumber());
    }

    @Test
    void testBirthYear() {
        assertEquals(2013, person1.getBirthYear());
        assertEquals(1983, person2.getBirthYear());
    }

    @Test
    void testBirthCountry() {
        assertEquals("Spain", person1.getBirthCountry());
        assertEquals("USA", person2.getBirthCountry());
    }

    @Test
    void testGender() {
        assertEquals('M', person1.getGender());
        assertEquals('M', person2.getGender());
    }
}