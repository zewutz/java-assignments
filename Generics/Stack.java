package Generics;

import java.util.LinkedList;

public class Stack<T> implements StackInterface<T> {
    private LinkedList<T> list;

    public Stack() {
        this.list = new LinkedList<T>();
    }

    public void push(T element) {
        this.list.push(element);
    }

    public T pop() {
        return this.list.pop();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int size() {
        return this.list.size();
    }
}
