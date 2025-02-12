package lesson7.Homework.OOP.Task3;

import java.util.Objects;

class Author {
    String name;
    int yearOfBirth;

    public Author(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", this.name, this.yearOfBirth);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Author author = (Author) obj;

        return Objects.equals(name, author.name) &&
                Objects.equals(yearOfBirth, author.yearOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }
}