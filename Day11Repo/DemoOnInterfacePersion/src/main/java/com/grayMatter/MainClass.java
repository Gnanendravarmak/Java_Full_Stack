package com.grayMatter;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            AppPersonImp app = new AppPersonImp();

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Add Person");
                System.out.println("2. Get Person by ID");
                System.out.println("3. Get All Persons");
                System.out.println("4. Update Person");
                System.out.println("5. Delete Person");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter id: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter mobile: ");
                        String mobile = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();

                        Person newPerson = new Person(id, age, name, mobile, email);
                        try {
                            Person addedPerson = app.addPerson(newPerson);
                            System.out.println("Person added: " + addedPerson);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        System.out.print("Enter ID: ");
                        int id1 = scanner.nextInt();
                        try {
                            Person person = app.getPersonById(id1);
                            if (person != null) {
                                System.out.println("Person found: " + person);
                            } else {
                                System.out.println("Person not found.");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        try {
                            List<Person> persons = app.getAllPersons();
                            for (Person p : persons) {
                                System.out.println(p);
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 4:
                        System.out.print("Enter ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        System.out.print("Enter new age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new mobile: ");
                        String newMobile = scanner.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.nextLine();

                        Person updatedPerson = new Person(updateId, newAge, newName, newMobile, newEmail);
                        try {
                            Person result = app.updatePerson(updatedPerson, updateId);
                            System.out.println("Person updated: " + result);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 5:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = scanner.nextInt();
                        try {
                            Person deletedPerson = app.deletePerson(deleteId);
                            if (deletedPerson != null) {
                                System.out.println("Person deleted: " + deletedPerson);
                            } else {
                                System.out.println("Person not found.");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
