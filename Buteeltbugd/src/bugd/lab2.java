package bugd;
public class lab2<E> {
    int front, rear;
    int size;
    int capacity;
    E[] array;
   
    public lab2(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = (E[]) new Object[this.capacity];
    }
//wefjh9weho
   
    boolean isFull(lab2 queue) {
        return (queue.size == queue.capacity);
    }


    boolean isEmpty(lab2 queue) {
        return (queue.size == 0);
    }


    void enqueue(E item) {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " daraalald orson");
    }

  
    E dequeue() {
        if (isEmpty(this))
            return null;
        E item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

 
    E front() {
        if (isEmpty(this))
            return null;
        return this.array[this.front];
    }

  
    E rear() {
        if (isEmpty(this))
            return null;
        return this.array[this.rear];
    }
    int uldsenTaraalliinToo() {
        return (capacity - size);
    }

}
