package lesson12.homework.Task3;

import java.util.Objects;

public class OrderedIntPair {
    public final int key, value;

    public OrderedIntPair(int key, int value) {
        if(key < value) {
            this.key = key;
            this.value = value;
        } else {
            this.key = value;
            this.value = key;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        OrderedIntPair refPair = (OrderedIntPair) obj;

        return Objects.equals(key, refPair.key) && Objects.equals(value, refPair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return String.format("{%d and %d}", key, value);
    }
}
