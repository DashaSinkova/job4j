package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();
    public void add(Person person) {
        persons.add(person);
    }
    public ArrayList<Person> find(String key) {
        ArrayList<Person> res = new ArrayList<Person>();
        Predicate<Person> checkAddress = person -> person.getAddress().contains(key);
        Predicate<Person> checkName = person -> person.getName().contains(key);
        Predicate<Person> checkSurname = person -> person.getSurname().contains(key);
        Predicate<Person> checkPhone = person -> person.getPhone().contains(key);
        Predicate<Person> combine = checkAddress.or(checkName).or(checkSurname).or(checkPhone);
        for (Person person : persons) {
            if (combine.test(person)) {
                res.add(person);
            }
        }
        return res;
    }

}
