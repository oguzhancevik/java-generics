package io.github.oguzhancevik.beforegenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PreGenerics {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add("abc");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer number = (Integer) iterator.next();
            System.out.println(number);
        }
    }
}
