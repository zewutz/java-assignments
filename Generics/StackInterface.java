package Generics;

import java.util.LinkedList;

public interface StackInterface<T> {
    void push(T element);
    T pop();
    boolean isEmpty();
    int size();
}


