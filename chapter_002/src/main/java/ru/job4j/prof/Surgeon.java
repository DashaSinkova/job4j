package ru.job4j.prof;
/**
 * Курс Стажер 002ООП.2.3
 */
public class Surgeon extends Doctor {
    private String specialization;
    public Surgeon(String name, String surname, String education, String birthday, String category, String tools, String specialization) {
        super(name, surname, education, birthday, category, tools);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
