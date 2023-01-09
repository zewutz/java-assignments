package Generics;

public interface SortedListInterface<T extends Comparable<T>> {
    void insert(T element);
    T remove(int index);
    boolean isEmpty();
    int size();
    T get(int index);
}

