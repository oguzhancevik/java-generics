package io.github.oguzhancevik.chapter4;

import io.github.oguzhancevik.chapter3.AgeComparator;
import io.github.oguzhancevik.chapter3.ReverseComparator;
import io.github.oguzhancevik.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter4Example {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person2 = new Person("Mehmet Çomak", 1995);
        Person person1 = new Person("Emrullah Yıldırım", 1994);
        Person person3 = new Person("Oğuzhan Çevik", 1996);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        final Person olderPerson = GenericMaximizer.maximum(personList, new AgeComparator());

        System.out.println(olderPerson.getFullName());

    }


}
