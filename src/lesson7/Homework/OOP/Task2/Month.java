package lesson7.Homework.OOP.Task2;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public boolean isWinter(Month month) {
        return month == Month.JANUARY || month == Month.FEBRUARY || month == Month.DECEMBER;
    }
}
