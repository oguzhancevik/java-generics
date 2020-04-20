package io.github.oguzhancevik.chapter2;

import io.github.oguzhancevik.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Emrullah Yıldırım", 1995);
        Person person2 = new Person("Mehmet Çomak", 1995);
        Person person3 = new Person("Oğuzhan Çevik", 1996);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        for (Person personX : personList) {
            System.out.println(personX);
        }

    }
}
