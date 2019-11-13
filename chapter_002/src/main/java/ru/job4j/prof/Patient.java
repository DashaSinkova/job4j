package ru.job4j.prof;
/**
 * Курс Стажер 002ООП.2.3
 */
public class Patient extends Diagnose {
    private String name, surname, birthday;
    public Patient(String name, String surname, String birthday, String diagnose, String therapy) {
        super(diagnose, therapy);
        this.birthday = birthday;
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
