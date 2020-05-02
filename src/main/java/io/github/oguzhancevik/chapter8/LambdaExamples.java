package io.github.oguzhancevik.chapter8;

import io.github.oguzhancevik.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExamples {

    public static void main(String[] args) {
        Person person1 = new Person("Emrullah Yıldırım", 1994);
        Person person2 = new Person("Mehmet Çomak", 1995);
        Person person3 = new Person("Oğuzhan Çevik", 1996);


        Predicate<Person> isOld = person -> person.getYearOfBirth() < 1995;
        System.out.println(isOld.test(person1));
        System.out.println(isOld.test(person2));
        System.out.println(isOld.test(person3));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Map<Boolean, List<Person>> oldAndYoundPeople = personList.stream().collect(Collectors.partitioningBy(person -> person.getYearOfBirth()>1995));
        System.out.println(oldAndYoundPeople);


    }

}
