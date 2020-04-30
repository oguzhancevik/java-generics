package io.github.oguzhancevik.chapter4;

import java.util.Comparator;
import java.util.List;

public class Maximizer {

    public static Object maximum(List values, Comparator comparator) {
        Object maximumElement = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            final Object element = values.get(i);
            if (comparator.compare(element, maximumElement) > 0) {
                maximumElement = element;
            }
        }
        return maximumElement;
    }

}
