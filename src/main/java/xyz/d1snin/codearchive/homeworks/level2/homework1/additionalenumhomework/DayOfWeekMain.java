package xyz.d1snin.codearchive.homeworks.level2.homework1.additionalenumhomework;

import java.time.LocalTime;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.WEDNESDAY));
    }
    private static String getWorkingHours(DayOfWeek d) {
        if (d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY) {
            return "Сегодня выходной!";
        }
        int totalWorkingDays = 5;
        LocalTime hoursAndMinutes = LocalTime.now();
        int hours = (totalWorkingDays - d.getNumber()) * 24;
        int hoursThisDay = 24 - Integer.parseInt(hoursAndMinutes.toString().substring(0, 2));
        int minutesThisHour = 60 - Integer.parseInt(hoursAndMinutes.toString().substring(3, 5));
        return "До конца недели в вашем регионе осталось: " + (hours + hoursThisDay) + " часа и " + minutesThisHour + " минут!\nТекущее время: " + hoursAndMinutes.toString().substring(0,8);
    }
}
