package Generics;

import java.util.LinkedList;

public class Queue<T> implements QueueInterface<T> {
    private LinkedList<T> list;

    public Queue() {
        this.list = new LinkedList<T>();
    }

    @Override
    public void enqueue(T element) {
        this.list.addLast(element);
    }

    public T dequeue() {
        return this.list.remove(0);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int size() {
        return this.list.size();
    }
}
