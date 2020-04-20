package io.github.oguzhancevik.chapter2;

import io.github.oguzhancevik.model.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap<>();

        Person person1 = new Person("Emrullah Yıldırım", 1995);
        Person person2 = new Person("Mehmet Çomak", 1995);
        Person person3 = new Person("Oğuzhan Çevik", 1996);

        personMap.put(person1.getFullName(), person1);
        personMap.put(person2.getFullName(), person2);
        personMap.put(person3.getFullName(), person3);

        for (Person personX : personMap.values()) {
            System.out.println(personX);
        }
    }
}
