package codegym;

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

    public T get(int index) {
        try {
            Node currentElement = first.next;
            int count = 0;
            while (count < index && (currentElement) != null) {
                currentElement = currentElement.next;
                count++;
            }
            return (T) currentElement.value;
        } catch (NullPointerException ex) {
            throw new NoSuchElementException();
        }
    }

    public void add(T value) {
        Node node = new Node();
        node.value = value;
        Node ref = last.prev;
        ref.next = node;
        last.prev = node;
        node.prev = ref;
    }
    // Adding peek(), pop(), and remove() for utility/practice
    // Need to add remove() for use in pop() and pollFirst()
    public void remove() {
        Node currentNode = first.next;
        if (first.next != last) {
            Node secondNode;
            if (currentNode != last.prev) {  // More nodes exist, swap
                secondNode = currentNode.next;
                first.next = secondNode;
                secondNode.prev = first;
            } else {    // currentNode is last populated node, reset
                first.next = last;
                last.prev = first;
            }
            currentNode = null; // Erase currentNode
        } else { // LinkedList had no content nodes
            throw new NoSuchElementException();
        }
    }

    // Retrieves, but does not remove, the head (first element) of this list.
    public T peek() {
        try {
            return this.get(0);
        } catch (NoSuchElementException ex) {
            return null;
        }
    }

    public T pop() {
        T temp = this.get(0);
        this.remove();
        return (T) temp; // Cast should be unnecessary since it exists in get
    }

    // Retrieves and removes the first element of this list, or returns null if this list is empty.
    // PollFirst looks exactly like pop() only it can return null
    public T pollFirst() {
        try {
            T temp = this.get(0);
            this.remove();
            return (T) temp;
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
    }
}