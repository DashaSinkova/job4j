package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        System.out.println(jsonReport.generate("Report's name", "Report's body"));
    }
}
