package ru.job4j.collection;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;
    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public int compareTo(User another) {
        int i = this.getName().compareTo(another.getName());
        if (i == 0) {
            i = Integer.compare(this.getAge(), another.getAge());
        }
        return i;
    }
    @Override
    public String toString() {
        return name;
    }
}
