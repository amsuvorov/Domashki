package org.example;

class UserProvider {
    private static final String[] NAMES = {"John", "Bill", "Clara", "Kate", "Bob", "Monica"};
    private static final String[] DOMAINS = {"gmail.com", "yahoo.com", "hotmail.com"};
    private static final String[] GENDERS = {"male", "female"};

    public static String randomName() {
        int index = (int) (Math.random() * NAMES.length);
        return NAMES[index];
    }

    public static int randomAge() {
        return (int) (Math.random() * 60) + 18;
    }

    public static String randomEmail() {
        int index = (int) (Math.random() * DOMAINS.length);
        return randomName().toLowerCase() + "@" + DOMAINS[index];
    }

    public static String randomGender() {
        int index = (int) (Math.random() * GENDERS.length);
        return GENDERS[index];
    }

    public static User generateUser() {
        String name = randomName();
        int age = randomAge();
        String email = randomEmail();
        String gender = randomGender();
        return new User(name, age, email, gender);
    }
}
