/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibt;

import java.time.LocalDate;

/**
 *
 * @author Timothy Bradford
 */
public class BirthdayDateTime {

    public int getAge() {
        if (this.day > LocalDate.now().getDayOfMonth() && this.month > LocalDate.now().getMonthValue()) {
            return LocalDate.now().getYear() - this.year - 1;
        }

        return LocalDate.now().getYear() - this.year;
    }

    /**
     * index string array of all months of the year starting at 1 == January
     */
    public static final String[] MONTHS = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    private int year;
    private int day;
    private int month;
    private int age;

    public BirthdayDateTime(int year, int day, int month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return "BirthdayDateTime{" + "year=" + year + ", day=" + day + ", month=" + month + '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public String getStringMonth() {
        return MONTHS[month];
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setMonth(String month) {
        for (int i = 0; i < MONTHS.length; i++) {
            if (MONTHS[i].toUpperCase().equals(month.toUpperCase())) {
                this.month = i;
            }
        }
    }

}
