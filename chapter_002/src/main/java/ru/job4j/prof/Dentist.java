package ru.job4j.prof;
/**
 * Курс Стажер 002ООП.2.3
 */
public class Dentist extends Doctor {
    private boolean anesthesia;
    public Dentist(String name, String surname, String education, String birthday, String category, String tools, boolean anesthesia) {
        super(name, surname, education, birthday, category, tools);
        this.anesthesia = anesthesia;
    }
    public boolean getAnesthesia() {
        return anesthesia;
    }
    public void setAnesthesia(boolean anesthesia) {
        this.anesthesia = anesthesia;
    }
}
