package com.grayMatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppPersonImp implements PersonInterface {

    private Connection conn;

    public AppPersonImp() throws ClassNotFoundException, SQLException {
        this.conn = DbConnection.getConnection();
    }

    @Override
    public List<Person> getAllPersons() throws SQLException {
        String query = "SELECT * FROM person";
        List<Person> persons = new ArrayList<>();

        try (PreparedStatement pm = conn.prepareStatement(query);
             ResultSet rs = pm.executeQuery()) {

            if (!rs.isBeforeFirst()) {
                System.out.println("Table is empty.");
                return persons;
            }

            while (rs.next()) {
                persons.add(new Person(rs.getInt("id"), rs.getInt("age"), rs.getString("name"), rs.getString("mobile"), rs.getString("email")));
            }
        }
        return persons;
    }

    @Override
    public Person getPersonById(int id) throws SQLException {
        String query = "SELECT * FROM person WHERE id = ?";
        Person person = null;

        try (PreparedStatement pm = conn.prepareStatement(query)) {
            pm.setInt(1, id);
            try (ResultSet rs = pm.executeQuery()) {
                if (rs.next()) {
                    person = new Person(rs.getInt("id"), rs.getInt("age"), rs.getString("name"), rs.getString("mobile"), rs.getString("email"));
                }
            }
        }
        return person;
    }

    @Override
    public Person addPerson(Person person) throws SQLException {
        String query = "INSERT INTO person (id, age, name, mobile, email) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pm = conn.prepareStatement(query)) {
            pm.setInt(1, person.getId());
            pm.setInt(2, person.getAge());
            pm.setString(3, person.getPersonName());
            pm.setString(4, person.getMobile());
            pm.setString(5, person.getEmail());

            int affectedRows = pm.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Inserting person failed, no rows affected.");
            }
        }
        return person;
    }

    @Override
    public Person updatePerson(Person person, int id) throws SQLException {
        String query = "UPDATE person SET age = ?, name = ?, mobile = ?, email = ? WHERE id = ?";

        try (PreparedStatement pm = conn.prepareStatement(query)) {
            pm.setInt(1, person.getAge());
            pm.setString(2, person.getPersonName());
            pm.setString(3, person.getMobile());
            pm.setString(4, person.getEmail());
            pm.setInt(5, id);

            pm.executeUpdate();           
        }
        return person;
    }

    @Override
    public Person deletePerson(int id) throws SQLException {
        Person person = getPersonById(id);

        if (person == null) {
            return null;
        }

        String deleteQuery = "DELETE FROM person WHERE id = ?";

        try (PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {
            deleteStmt.setInt(1, id);
            deleteStmt.executeUpdate();
        }
        return person;
    }
}
