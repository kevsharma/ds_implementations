package structures;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T>{
    // This is an arrayList implementation of a queue.
    // One could use a rear LL implementation instead.
    ArrayList<T> queue;

    public Queue<T>(){
        queue = new ArrayList<T>();
    }

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue() throws NoSuchElementException{
        if(queue.size() == 0){
            throw new NoSuchElementException("Queue is empty.");
        }

        return queue.remove(0);
    }

    public T peek() throws NoSuchElementException{
        if(queue.size() == 0){
            throw new NoSuchElementException("Queue is empty.");
        }

        return queue.get(0);
    }

    public boolean isEmpty(){
        return queue.size() == 0;
    }

    public int size(){
        return size;
    }
}
