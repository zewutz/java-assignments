package Generics;

import java.util.LinkedList;

public interface QueueInterface<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    int size();
}


