package com.grayMatter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppPersonImpTest {

    private AppPersonImp appPersonImp;
    private Connection connection;

    @BeforeEach
    void setUp() throws ClassNotFoundException, SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/graymatter", "root", "password");
        appPersonImp = new AppPersonImp();
    }

    @AfterEach
    void tearDown() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    @Test
    void testGetAllPersons() throws SQLException {
        List<Person> persons = appPersonImp.getAllPersons();
        assertNotNull(persons);
        assertTrue(persons.size() > 0, "Should return at least one person");
    }

    @Test
    void testGetPersonById() throws SQLException {
        Person person = appPersonImp.getPersonById(3);
        assertNotNull(person);
        assertEquals(3, person.getId());
        assertEquals("Jim Brown", person.getPersonName());
    }

    @Test
    void testAddPerson() throws SQLException {
        Person person = new Person(100, 30, "kiran", "1234567890", "testpekiran@gmail.com");
        Person addedPerson = appPersonImp.addPerson(person);
        assertEquals(person.getPersonName(), addedPerson.getPersonName());
    }

    @Test
    void testUpdatePerson() throws SQLException {
        Person person = new Person(100, 22, "varma", "0987654321", "varmak@gmail.com");
        Person updatedPerson = appPersonImp.updatePerson(person, 1);
        assertNotNull(updatedPerson);
        assertEquals(person.getPersonName(), updatedPerson.getPersonName());
    }

    @Test
    void testDeletePerson() throws SQLException {
        Person person = appPersonImp.deletePerson(100);
        assertEquals(100, person.getId());
    }
}

