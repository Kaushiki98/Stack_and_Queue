public class Stack_Queue {
    Node front, rear;
    //NUMBER OF LINES
    int size;

    public Stack_Queue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
    //ADDING OF ELEMENTS
    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        size++;
        System.out.println("Data:"+data);
    }
    //REMOVING OF ELEMENTS
    public int dequeue() {
        int data = front.data;
        front = front.next;
        if (isEmpty())
        {
            rear = null;
        }
        size--;
        System.out.println("Removed Data"+data);
        return data;
    }

}
