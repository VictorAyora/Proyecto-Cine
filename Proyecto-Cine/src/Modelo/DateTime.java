/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class DateTime {

    public int Year = 0;
    public int Month = 0;
    public int Day = 0;
    public int Hour = 0;
    public int Minute = 0;
    public int Second = 0;

    public DateTime(int year, int month, int day) {
        this.Year = year;
        this.Month = month;
        this.Day = day;
        this.Hour = 0;
        this.Minute = 0;
        this.Second = 0;
    }

    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        this.Year = year;
        this.Month = month;
        this.Day = day;
        this.Hour = hour;
        this.Minute = minute;
        this.Second = second;
    }

    public DateTime(String dateTimeString) {
        String[] date_time = dateTimeString.split(" ");
        String[] date = date_time[0].split("/");
        String[] time = date_time[1].split(":");
        this.Year = Integer.parseInt(date[2]);
        this.Month = Integer.parseInt(date[1]);
        this.Day = Integer.parseInt(date[0]);
        this.Hour = Integer.parseInt(time[0]);
        this.Minute = Integer.parseInt(time[1]);
        this.Second = Integer.parseInt(time[2]);
    }

    public static DateTime Now() {
        Date horaActual = new Date();
        int yy = (horaActual.getYear() + 1900);
        int mm = (horaActual.getMonth() + 1);
        int dd = horaActual.getDate();
        int hh = horaActual.getHours();
        int mi = horaActual.getMinutes();
        int ss = horaActual.getSeconds();

        return new DateTime(yy, mm, dd, hh, mi, ss);
    }

    @Override
    public String toString() {
        return DosDigitos(this.Day) + "/"
                + DosDigitos(this.Month) + "/"
                + this.Year + " "
                + DosDigitos(this.Hour) + ":"
                + DosDigitos(this.Minute) + ":"
                + DosDigitos(this.Second);
    }

    private String DosDigitos(int val) {
        if ((val + "").length() == 1) {
            return "0" + val;
        }
        return val + "";
    }
}
