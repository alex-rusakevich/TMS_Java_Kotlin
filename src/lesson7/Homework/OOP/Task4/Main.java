package lesson7.Homework.OOP.Task4;

public class Main {
    public static void main(String[] args) {
        Role vasya = Role.ADMIN;
        Role volodya = Role.USER;

        System.out.printf("Равные ли права у Васи и Володи? %b",
                vasya.getRights().equals(volodya.getRights()));
    }
}
