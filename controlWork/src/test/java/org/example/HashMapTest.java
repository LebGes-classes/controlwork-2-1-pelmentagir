package org.example;

import org.example.HashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;

public class HashMapTest {
    private HashMap<String,Integer> hashtable;
    @BeforeEach
    void setUp(){
        hashtable = new HashMap<>();
        hashtable.put("Данил",18);
    }
    @Test
    void putTest(){
        hashtable.put("Анвар",25);
        Assertions.assertEquals(25,hashtable.get("Анвар"));
    }
    @Test
    void putCollisionTest(){
        hashtable.put("Данил",25);
        Assertions.assertEquals(25,hashtable.get("Данил"));
    }
    @Test
    void containsTest(){
        Assertions.assertTrue(hashtable.contains("Данил"));
    }
    @Test
    void removeTest(){
        hashtable.remove("Данил");
        Assertions.assertTrue(hashtable.isEmpty());
    }
    @Test
    void sizeTest(){
        Assertions.assertEquals(1,hashtable.size());
    }
    @Test
    void isEmptyTest(){
        Assertions.assertFalse(hashtable.isEmpty());
    }
    @Test
    void containsValueTest(){
        Assertions.assertTrue(hashtable.containsValue(18));
    }
    @Test
    void clearTest(){
        hashtable.clear();
        Assertions.assertTrue(hashtable.isEmpty());
    }
}
