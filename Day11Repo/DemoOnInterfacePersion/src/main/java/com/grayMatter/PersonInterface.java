package com.grayMatter;

import java.sql.SQLException;
import java.util.List;

public interface PersonInterface {
	
	List<Person> getAllPersons() throws ClassNotFoundException, SQLException;
	Person getPersonById(int id) throws ClassNotFoundException, SQLException;
	Person addPerson(Person person) throws ClassNotFoundException, SQLException;
	Person updatePerson(Person person, int id) throws ClassNotFoundException, SQLException;
	Person deletePerson(int id) throws ClassNotFoundException, SQLException;

}
