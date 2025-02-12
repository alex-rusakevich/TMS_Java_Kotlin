package lesson7.Homework.OOP.Task3;

public class Main {
    public static void main(String[] args) {
        Author kupala = new Author("Янка Купала", 1882);
        Author kolas = new Author("Якуб Колас", 1882);

        Book newLand = new Book("Новая зямля", kolas, 1911);
        Book newLand2 = new Book("Новая зямля", kolas, 1913);
        Book naRostannyah = new Book("На ростанях", kolas, 1955);
        Book theLocals = new Book("Тутэйшыя", kupala, 1922);

        System.out.printf("%b, %b\n", newLand.equals(newLand2), naRostannyah.equals(theLocals));
    }
}
