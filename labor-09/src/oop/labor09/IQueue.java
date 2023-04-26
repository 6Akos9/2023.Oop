package oop.labor09;

import java.util.ArrayList;

public interface IQueue {
    boolean isEmpty();

    boolean isFull();

    void enQueue(Object item);

    Object deQueue();

    void printQueue();
}