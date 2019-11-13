package ru.job4j.prof;

/**
 * Курс Стажер 002ООП.2.3
 */
public class Profession {
    private String name, surname, education, birthday;
    public Profession(String name, String surname, String education, String birthday) {
        this.birthday = birthday;
        this.education = education;
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
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
    public void setEducation(String education) {
        this.education = education;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
