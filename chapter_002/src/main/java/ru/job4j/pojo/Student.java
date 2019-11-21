package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String name;
    private String group;
    private Date date;

    public String getFIO() {
        return name;
    }

    public void setFIO(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
