package codegym;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class OurLinkedList<T> {
    private Node<T> first = new Node<>();
    private Node<T> last = new Node<>();

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
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.next;
        }
        Node ref = currentElement.prev;
        ref.next = node;
        currentElement.prev = node;
        node.prev = ref;
        node.next = currentElement;
    }

    public void add(T value) {
        Node node = new Node();
        node.value = value;
        Node temp = last.prev;
        temp.next = node;
        last.prev = node;
        node.prev = temp;
        node.next = last;
    }

    public T get(int index) {
        Node currentElement = first.next;
        if(currentElement == last || currentElement == null){
            throw new NoSuchElementException("Could not get index");
        }
        int count = 0;
        while ((count < index && (currentElement) != null)) {
            currentElement = currentElement.next;
            if (count++ == index) {
                break;
            }
        }
        return (T) currentElement.value;
    }

    public T remove(){
        Node nodeToRemove = first.next;
        first.next = nodeToRemove.next;
        nodeToRemove.next.prev = first;
        return (T) nodeToRemove.value;
    }

    public T peek() {
       return get(0);
    }

    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
    }
}