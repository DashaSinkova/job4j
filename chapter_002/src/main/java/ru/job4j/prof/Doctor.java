package ru.job4j.prof;
/**
 * Курс Стажер 002ООП.2.3
 */
public class Doctor extends Profession {
    private String tools, category;
    public Doctor(String name, String surname, String education, String birthday, String category, String tools) {
        super(name, surname, education, birthday);
        this.tools = tools;
        this.category = category;
    }
    public String getTools() {
        return tools;
    }
    public String getCategory() {
        return category;
    }
    public void setTools() {
        this.tools = tools;
    }
    public void setCategory() {
        this.category = category;
    }
    public String heal(Patient patient) {
        return patient.getDiagnoseAndTherapy();
    }
}
