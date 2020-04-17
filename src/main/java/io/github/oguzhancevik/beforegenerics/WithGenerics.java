package io.github.oguzhancevik.beforegenerics;

import java.util.ArrayList;
import java.util.List;

public class WithGenerics {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (Integer number : list) {
            System.out.println(number);
        }
    }

}
