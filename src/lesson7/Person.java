package lesson7;

public class Person {
    private String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
