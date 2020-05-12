package ru.job4j.streamapi;

public class Student {
    private int score;
    private String surname;
    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + ", surname='" + surname + '\'' + '}';
    }
}
