//Chanchakorn Jullapech
//672115007
public class queue {
    private int front;
    private int rear;
    private int length;
    private String[] QueueList;   

    queue(int Capacity){
        QueueList = new String[Capacity];
        front = 0;
        rear = 0;
        length = 0;
    }

    public int size(){
        return length;
    }

    public boolean isFull(){
        return length == QueueList.length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void enqueue(String name){
        if(isFull()){
            System.out.println("Error, the queue is full");
            return;
        }
        System.out.println("Enqueue " + name);
        QueueList[rear] = name;
        rear++;
        length++;

    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Error, the queue is empty");
            return;
        }
        System.out.println("Dequeue " + QueueList[front]);

        QueueList[front] = null ;
        front++;
        length--;
    }

    public void print() {
        String[] currentQueue = new String[QueueList.length];
        
        int index = 0;
        for (int i = front; i < front + length; i++) {
            currentQueue[index] = QueueList[i % QueueList.length];
            index++;
        }

        System.out.print("[");
        for (int i = 0; i < QueueList.length; i++) {
            if (i < currentQueue.length) {
                System.out.print(currentQueue[i]);
            }
            if (i < QueueList.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("] ");
        System.out.println("[first = " + front + ", rear = " + rear + ", length = " + length + "]");
    }

}
