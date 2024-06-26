package org.example;

public interface Hash<K,V> {
    void put(K key, V value);
    V get(K key);
    boolean isEmpty();
    boolean contains(K key);
    boolean containsValue(V value);
    V remove(K key);
    int size();
    void clear();
}