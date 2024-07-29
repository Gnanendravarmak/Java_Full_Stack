package com.grayMatter;

import java.util.Objects;

public class Person {
	
	private int id;
	private int age;
	private String personName;
	private String mobile;
	private String email;
		
	public Person() {
		super();
	}

	public Person(int id, int age, String personName, String mobile, String email) {
		super();
		this.id = id;
		this.age = age;
		this.personName = personName;
		this.mobile = mobile;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
               age == person.age &&
               Objects.equals(personName, person.personName) &&
               Objects.equals(mobile, person.mobile) &&
               Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, personName, mobile, email);
    }
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", personName=" + personName + ", mobile=" + mobile + ", email="
				+ email + "]";
	}
	
	

}
