package ru.job4j.pojo;

import java.util.Calendar;

public class Student {
    private String fio;
    private int group;
    private Calendar joined;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Calendar getJoined() {
        return joined;
    }

    public void setJoined(Calendar joined) {
        this.joined = joined;
    }
}