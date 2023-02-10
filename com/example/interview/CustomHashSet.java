package com.example.interview;

import java.util.HashMap;
import java.util.Map;

public class CustomHashSet<T> {

    Map< T, Object> map;

    public CustomHashSet(int size) {
        map = new HashMap<>(size);
    }

    public boolean add(T value){
        return map.put(value, new Object()) == null;

    }
    public void display(){
        map.keySet().forEach(System.out::println);
    }

    public boolean delete(T value){
        map.remove(value);
        return true;
    }

}
