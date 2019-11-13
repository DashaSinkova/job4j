package ru.job4j.prof;

public class Diagnose {
    private String diagnose, therapy;
    public Diagnose(String diagnose, String therapy) {
        this.diagnose = diagnose;
        this.therapy = therapy;
    }
    public String getDiagnoseAndTherapy() {
        return  diagnose + ", " + therapy;
    }
    public String getDiagnose() {
        return  diagnose;
    }
    public String getTherapy() {
        return therapy;
    }
    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }
    public void  setTherapy(String therapy) {
        this.therapy = therapy;
    }
}
