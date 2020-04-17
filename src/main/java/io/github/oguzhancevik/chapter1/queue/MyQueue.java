package io.github.oguzhancevik.chapter1.queue;

public class MyQueue {

    private Object[] queue;
    private int readCursor;
    private int writeCursor;

    public MyQueue(int size) {
        queue = new Object[size];
    }

    public boolean add(Object value) {
        if (queue[writeCursor] != null) {
            return false;
        }
        queue[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public Object remove() {
        Object value = queue[readCursor];
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
