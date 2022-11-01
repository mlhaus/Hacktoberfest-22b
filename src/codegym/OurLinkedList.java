package codegym;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class OurLinkedList<T> {
    private Node<T> first = new Node<>();
    private Node<T> last = new Node<>();


    transient int size = 0;
    protected transient int modCount = 0;

    public OurLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(int index, T value) {
        Node node = new Node();
        node.value = value;
        Node currentElement = first.next;
        for(int i = 0; i < index; i++) {
            currentElement = currentElement.next;
        }
        Node ref = currentElement.prev;
        ref.next = node;
        currentElement.prev = node;
        node.prev = ref;
        node.next = currentElement;
    }

    public T get(int index) {
        Node currentElement = first.next;
        int count = 0;
        while (count < index && (currentElement) != null) {
            currentElement = currentElement.next;
            count++;
        }
        return (T) currentElement.value;
    }

    public void add(T value) {
        Node node = new Node();
        node.value = value;
        Node ref = last.prev;
        ref.next = node;
        last.prev = node;
        node.prev = ref;
        node.next = last;
    }

    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
    }
    public T removeFirst(){
        Node nodeToRemove = first.next;
        first.next = nodeToRemove.next;
        nodeToRemove.next.prev = first;
        return (T) nodeToRemove.value;
    }

    public T remove(){
        Node nodeToRemove = first.next; // refrence to the node
        first.next = nodeToRemove.next; // discounting
        nodeToRemove.next.prev = first; // conecting the node
        return (T) nodeToRemove.value;
    }

}
