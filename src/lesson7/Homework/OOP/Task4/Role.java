package lesson7.Homework.OOP.Task4;

public enum Role {
    ADMIN("CRUD"),
    MODERATOR("RU"),
    USER("R");

    private final String rights;

    Role(String rights) {
        this.rights = rights;
    }

    public String getRights() {
        return rights;
    }
}
