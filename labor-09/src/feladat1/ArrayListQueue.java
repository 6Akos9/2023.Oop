package feladat1;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue {

    private final ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int CAPACITY) {
        this.items = new ArrayList<>();
        this.CAPACITY = CAPACITY;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return items.size() >= CAPACITY;
    }

    public void enQueue(Object item) {
        if (items.size() < CAPACITY) {
            items.add(item);
        }
    }

    public Object deQueue() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(0);
    }

    public void printQueue() {
        for (Object item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ArrayListQueue other = (ArrayListQueue) obj;
        if (items.size() != other.items.size()) {
            return false;
        }
        for (int i = 0; i < items.size(); i++) {
            if (!items.get(i).equals(other.items.get(i))) {
                return false;
            }
        }
        return true;
    }

}