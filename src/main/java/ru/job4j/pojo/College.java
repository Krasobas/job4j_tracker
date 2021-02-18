package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student ivan123 = new Student();
        ivan123.setFio("Иванов Иван Иванович");
        ivan123.setGroup(21);
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy года.");
        ivan123.setJoined(new GregorianCalendar(2017, Calendar.JANUARY, 25));
        System.out.println(ivan123.getFio() + ". Группа №" + ivan123.getGroup()
                + ". Поступил " + formatter.format(ivan123.getJoined().getTime()));
    }
}
