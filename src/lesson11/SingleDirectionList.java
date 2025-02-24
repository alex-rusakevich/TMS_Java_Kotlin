package lesson11;

import java.util.ArrayList;
import java.util.List;

public class SingleDirectionList<T> {
    private Node<T> first;
    private int size;

    public SingleDirectionList() {
        this.first = null;
        this.size = 0;
    }

    public SingleDirectionList(List<T> valuesList) {
        for(int i=0; i<valuesList.size(); i++) {
            this.add(i, valuesList.get(i));
        }
    }

    public void add(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(value);

        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<T> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            first = first.next;
        } else {
            Node<T> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public int size() {
        return size;
    }

    public List<T> toList(){
        List<T> result = new ArrayList<>();
        Node<T> current = first;

        while (current != null) {
            result.add(current.value);
            current = current.next;
        }

        return result;
    }
}
