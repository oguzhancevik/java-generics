package io.github.oguzhancevik.chapter3;

import io.github.oguzhancevik.model.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        return Integer.compare(left.getYearOfBirth(), right.getYearOfBirth());
    }
}
