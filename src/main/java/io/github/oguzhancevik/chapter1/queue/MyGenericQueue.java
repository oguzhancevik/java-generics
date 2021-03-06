package io.github.oguzhancevik.chapter1.queue;

public class MyGenericQueue<T> {

    private T[] queue;
    private int readCursor;
    private int writeCursor;

    public MyGenericQueue(int size) {
        queue = (T[]) new Object[size];
    }

    public boolean add(T value) {
        if (queue[writeCursor] != null) {
            return false;
        }
        queue[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public T remove() {
        T value = queue[readCursor];
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
