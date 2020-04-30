package io.github.oguzhancevik.chapter4;

import java.util.Comparator;
import java.util.List;

public class GenericMaximizer {

    public static <T> T maximum(List<T> values, Comparator<T> comparator) {
        T maximumElement = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);
            if (comparator.compare(element, maximumElement) > 0) {
                maximumElement = element;
            }
        }
        return maximumElement;
    }
}
