package io.github.oguzhancevik.chapter1.queue;

public class MyStringQueue {

    private String[] queue;
    private int readCursor;
    private int writeCursor;

    public MyStringQueue(int size) {
        queue = new String[size];
    }

    public boolean add(String value) {
        if (queue[writeCursor] != null) {
            return false;
        }
        queue[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public String remove() {
        String value = queue[readCursor];
        if (value != null) {
            queue[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    private int next(int index) {
        return (index + 1) % queue.length;
    }

}
