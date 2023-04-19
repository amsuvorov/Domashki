package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public  class Main {
        public static void main(String[] args) {
                List<User> users = Stream.generate(UserProvider::generateUser)
                        .limit(20)
                        .filter(user -> user.getAge() > 18)
                        .sorted(Comparator.comparing(User::getName))
                        .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                        .collect(Collectors.toList());

                Map<String, List<String>> groups = users.stream()
                        .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toList())));

                System.out.println(groups);
        }
}