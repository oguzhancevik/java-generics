package io.github.oguzhancevik.chapter1;

import io.github.oguzhancevik.chapter1.queue.MyGenericQueue;

public class GenericCollectionExample {

    public static void main(String[] args) {
        MyGenericQueue<String> queue = new MyGenericQueue<>(10);
        queue.add("a");
        queue.add("b");
        String value = concatenate(queue);
        System.out.println(value);

    }

    private static String concatenate(MyGenericQueue queue) {
        StringBuilder builder = new StringBuilder();
        String value;
        while ((value = (String) queue.remove()) != null) {
            builder.append(value);
        }
        return builder.toString();
    }

}
