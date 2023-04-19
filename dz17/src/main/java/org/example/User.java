package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {
    private String name;
    private int age;
    private String email;
    private String gender;

    public User(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public static void main(String[] args) {
        List<User> users = Stream.generate(() -> new User(randomName(), randomAge(), randomEmail(), randomGender()))
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                .collect(Collectors.toList());

        Map<String, List<String>> groups = users.stream()
                .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(groups);
    }

    private static String randomName() {
        String[] names = {"John", "Bill", "Clara", "Kate", "Bob", "Monica"};
        int index = (int) (Math.random() * names.length);
        return names[index];
    }

    private static int randomAge() {
        return (int) (Math.random() * 60) + 18;
    }

    private static String randomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com"};
        int index = (int) (Math.random() * domains.length);
        return randomName().toLowerCase() + "@" + domains[index];
    }

    private static String randomGender() {
        String[] genders = {"male", "female"};
        int index = (int) (Math.random() * genders.length);
        return genders[index];
    }
}