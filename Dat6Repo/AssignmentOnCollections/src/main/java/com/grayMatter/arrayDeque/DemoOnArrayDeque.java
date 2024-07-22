package com.grayMatter.arrayDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoOnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<User> arr = new ArrayDeque<>();

        arr.add(new User(1, "varma"));
        arr.add(new User(2, "Hello"));
        arr.add(new User(3, "World"));
        arr.add(new User(4, "Kishore"));
        
       

        System.out.println("Users in ArrayDeque:");
        for (User user : arr) {
            System.out.println(user.getId() + " " + user.getName());
        }
        
        System.out.println();

        System.out.println("Deque First User was Removed: " + arr.remove());

        System.out.println();
        System.out.println("Users in ArrayDeque:");
        for (User user : arr) {
            System.out.println(user.getId() + " " + user.getName());
        }

        System.out.println();
        User checkUser = new User(3, "World");
        System.out.println("Checking user is present or not: " + arr.contains(checkUser));

        System.out.println();
        arr.add(new User(5, "Kiran"));
        arr.add(new User(4, "Raghav"));

        System.out.println();
        System.out.println("Users in ArrayDeque after adding more users:");
        for (User user : arr) {
            System.out.println(user.getId() + " " + user.getName());
        }
        
        
        System.out.println();
        List<User> userList = new ArrayList<>(arr);

        Collections.sort(userList, new DemoComparator());


        System.out.println("Sorted Users:");
        for (User user : userList) {
            System.out.println(user.getId() + " " + user.getName());
        }
    }
    
}
