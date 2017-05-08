/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibt;

import java.time.LocalDate;

/**
 * This will store a person's birthday in a logical and easy to use format
 *
 * @author Timothy Bradford
 */
public class BirthdayDateTime {

    /**
     * index string array of all months of the year starting at 1 == January
     */
    public static final String[] MONTHS = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    private int year;
    private int day;
    private int month;

    /**
     * 
     * @param year year of birth
     * @param day day of birth
     * @param month month of birth
     */
    public BirthdayDateTime(int year, int day, int month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    /**
     * 
     * 
     * @param date string in the format mm/dd/yyyy
     */
    public BirthdayDateTime(String date) {
        setFromString(date);
    }

    /**
     * 
     * @return string in the format mm/dd/yyyy
     */
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    /**
     * 
     * @return the current age based on the given birth date
     */
    public int getAge() {
        if (this.day > LocalDate.now().getDayOfMonth() && this.month > LocalDate.now().getMonthValue()) {
            return LocalDate.now().getYear() - this.year - 1;
        }

        return LocalDate.now().getYear() - this.year;
    }

    /**
     * 
     * @return Year of birth
     */
    public int getYear() {
        return year;
    }

    /**
     * 
     * @param year year of birth
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 
     * @return day day of birth
     */
    public int getDay() {
        return day;
    }

    /**
     * 
     * @param day day day of birth
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * 
     * @return month day of birth
     */
    public int getMonth() {
        return month;
    }

    /**
     * 
     * @return month day of birth i.e. January..
     */
    public String getStringMonth() {
        return MONTHS[month];
    }

    /**
     * 
     * @param month month day of birth
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 
     * @param month month day of birth i.e. January..
     */
    public void setMonth(String month) {
        for (int i = 0; i < MONTHS.length; i++) {
            if (MONTHS[i].toUpperCase().equals(month.toUpperCase())) {
                this.month = i;
                return;
            }
        }
    }

    /**
     * 
     * @param s string date in the format mm/dd/yyyy
     */
    public final void setFromString(String s) {
        String m = "";
        String d = "";
        String y = "";
        int count = 0;

        while (count < s.length() && s.charAt(count) != '/') {
            m += s.charAt(count);
            count++;
        }
        count++;
        while (count < s.length() && s.charAt(count) != '/') {
            d += s.charAt(count);
            count++;
        }
        count++;
        while (count < s.length() && s.charAt(count) != '/') {
            y += s.charAt(count);
            count++;
        }

        this.setDay(Integer.parseInt(d));
        this.setMonth(Integer.parseInt(m));
        this.setYear(Integer.parseInt(y));
    }
}
