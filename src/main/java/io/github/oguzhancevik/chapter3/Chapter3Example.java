package io.github.oguzhancevik.chapter3;

import io.github.oguzhancevik.chapter3.before.AgeComparator;
import io.github.oguzhancevik.chapter3.before.ReverseComparator;
import io.github.oguzhancevik.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter3Example {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person2 = new Person("Mehmet Çomak", 1995);
        Person person1 = new Person("Emrullah Yıldırım", 1994);
        Person person3 = new Person("Oğuzhan Çevik", 1996);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Collections.sort(personList, new ReverseComparator<>(new AgeComparator()));
        personList.stream().forEach(System.out::println);
    }
}
