package feladat1;

public class CircularQueue implements IQueue{
    private final int CAPACITY;
    private final Object[] items;
    private int front;
    private int rear;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new Object[CAPACITY];
        this.front = -1;
        this.rear = -1;
    }
    public boolean isFull(){
        return ((rear + 1) % CAPACITY == front);
    }
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public void enQueue(Object element){
        if (isFull()){
            return;
        }
        rear = (rear + 1) % CAPACITY;
        items[rear] = element;
    }
    public Object deQueue(){
        if (isEmpty()){
            Object removed = items[front];
            if (front == rear){
                front = -1;
                rear = -1;
            }else {
                front = (front + 1) % CAPACITY;
            }
            return removed;
        }
        return null;
    }
    public void printQueue(){
        if (isEmpty()){
            System.out.println("Circular Queu is empty.");
            return;
        }
        System.out.println("Elements in Circular Queue are: ");
        for (int i = front; i <= rear; i = (i + 1) % CAPACITY) {
            System.out.println(items[i] + " ");
        }
        System.out.println();
    }
}
