package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();
    public void add(Person person) {
        persons.add(person);
    }
    public ArrayList<Person> find(String key) {
        ArrayList<Person> res = new ArrayList<Person>();
        for (Person person : this.persons) {
            if (person.getAddress().contains(key) || person.getName().contains(key) || person.getSurname().contains(key) || person.getPhone().contains(key) ) {
                res.add(person);
            }
        }
        return res;
    }
}
