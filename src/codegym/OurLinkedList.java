package codegym;

import java.util.LinkedList;
import java.lang.reflect.Array;
import java.util.ArrayList;
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

    public T pop(){
        last = last.prev;
        last.next = null;
        return last.value;
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
        Node currentElement = first.next;
        if(currentElement == last || currentElement == null) {
            throw new NoSuchElementException("Could not get that index");
        }
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

    public T getFirst(){
        Node<T> f = first.next;
        if (f.value == null){
            throw new NoSuchElementException();
        }
        return f.value;
    }

    public boolean contains(T ob1){
        boolean flag = false;
        Node currentElement = first.next;
        while((currentElement) != null)
        {
            if(currentElement.value == ob1){
                flag = true;
                break;
            }
            else{
                flag = false;

            }
            currentElement = currentElement.next;
        }
        return flag;
    }

    public T peekLast(){
        T value = null;
        Node lastValueNode = last.prev;
        if(!(first.equals(lastValueNode))){
            // set value to the value of lastValueNode, unless that node is the first node, which dose not hold a value
            value = (T)lastValueNode.value;
        }
        return value;
    }


    public void addFirst(T obj) {
//        Inserts the specified element at the beginning of this list.
        Node currentElement = first.next;
        int count = 0;
        while ((currentElement) != null) {
            if(count == 0){
                // To handle the case where first is null.  See the add method above.
                Node node = new Node();
                node.value = obj;
                first.next = node;
                first.next.next = currentElement;
                currentElement.prev = first;
            }
            currentElement = currentElement.next;
            count++;
        }
    }
    
    public T set(int index, T value) {
        Node node = new Node();
        node.value = value;
        Node currentElement = first.next;
        for(int i = 0; i < index; i++) {
            currentElement = currentElement.next;
        }
        Node oldNode = currentElement;
//        currentElement.value = node;
        node.prev = currentElement.prev;
        node.next = currentElement.next;
        if (currentElement.prev != null)
            currentElement.prev.next = node;
        if (currentElement.next != null)
            currentElement.next.prev = node;
        return (T) oldNode;
    }


    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
    }

    public T pollLast(){
        Node remove = last.prev;
        last.prev = remove.prev;
        remove.prev.next = last;
        return (T)remove.value;
    }
    
    public static void main(String[] args) {
        OurLinkedList<Integer> li = new OurLinkedList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.printAll();

        System.out.println(li.pollLast());
        li.printAll();
    }

    public boolean rith_remove(T value) {
        Node currentNode = first.next;
        boolean bool = false;
        while (currentNode.next != null) {
            if (currentNode.value.equals(value)) {
                Node beforeNode = currentNode.prev;
                Node afterNode = currentNode.next;
                beforeNode.next = afterNode;
                afterNode.prev = beforeNode;
                bool = true;
                break;
            }
            currentNode = currentNode.next;
        }
        return bool;
    }


    public T getLast() {
        Node<T> lastItem = last.prev;
        if (lastItem.value ==  null) {
            throw new NoSuchElementException();
        }
        else {
            return lastItem.value;
        }
    }

    public T removeLast() {
        Node node = new Node();
        node = last.prev;
        node.prev.next = last;
        last.prev = node.prev;
    //        last = last.prev.prev;
    //        last.next = null;
        return (T)node.value;
    }


    public int indexOf(T element) {
        int index = 0;
        Node current = first.next;

        while(current != null) {
            if(current.value == element) {
                return index;

            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }


    public boolean offer(T value){
        try{
            Node node = new Node();
            node.value = value;
            Node ref = last.prev;
            ref.next = node;
            last.prev = node;
            node.prev = ref;
            node.next = last;
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }


    public int size() {
        int count = 0;
        Node currentElement = first.next;
        while((currentElement) != null) {
            count++;
            currentElement = currentElement.next;
        }
        return --count;
    }

    public <Type> Type[] toArray(Type[] a) {
        Node currentNode = first.next;
        Type[] arr = (Type[]) Array.newInstance(a.getClass().getComponentType(), this.size());
        int index = 0;
        while(currentNode.value != null) {
//            System.out.println(index + ": " + currentNode.value);
            arr[index++] = (Type)currentNode.value;
            currentNode = currentNode.next;
        }

        return arr;
    }


    public void offerFirst(T element) {
        Node node = new Node();
        node.value = element;
        Node ref = first.next;
        ref.prev = node;
        first.next = node;
        node.next = ref;
        node.prev = first;
    }

    public T poll(){
        Node r = first.next;
        first.next = r.next;
        r.next.prev=first;
        return (T)r.value;

//        var rv = first.value;
//        first.next.prev = first.prev;
//        first.prev.next = first.next;
//        return rv;
    }


    public Object[] toArray() {
        // Matthew Meppelink
        Node currentElement = first.next;
        Object[] objArr = new Object[this.size()];
        int count = 0;
        while ((currentElement) != null) {
            if(currentElement.value == null){
                break;
            }
            objArr[count] = currentElement.value;
            count++;
            currentElement = currentElement.next;
        }
        return objArr;
    }
    
      public void clear() {
        first.next = last;
        last.prev = first;
      }

    // Retrieves and removes the head (first element) of this list.
    public T remove() {
        Node toBeRemoved = first.next;
        first.next = toBeRemoved.next;
        toBeRemoved.next.prev = first;

        return (T) toBeRemoved.value;
    }

    //Tyler Hand addlast
    public T addLast(T value){
        Node node = new Node();
        node.value = value;
        Node ref = last.prev;
        ref.next = node;
        last.prev = node;
        node.prev = ref;
        node.next = last;
        return (T)node.value;

    }

    public T peek(){
        if(first.next.value == null){
            return null;
        }
        return (T) first.next.value;
    }

    public Boolean removeLastOccurrence(T o) {

        if (o == null) {

            for (Node<T> x = last; x != null; x = x.prev) {
                if (x.value == null) {

                    Node<T> next = x.next;
                    Node<T> prev = x.prev;

                    if (prev == null) {

                        first = next;

                    } else {

                        prev.next = next;
                        x.prev = null;

                    }

                    if (next == null) {

                        last = prev;

                    } else {

                        next.prev = prev;
                        x.next = null;

                    }

                    x.value = null;

                    return true;


                }
            }
        }else{
            for (Node<T> x = last; x != null; x = x.prev) {
                if (o.equals(x.value)) {

                    Node<T> next = x.next;
                    Node<T> prev = x.prev;

                    if (prev == null) {

                        first = next;

                    } else {

                        prev.next = next;
                        x.prev = null;

                    }

                    if (next == null) {

                        last = prev;

                    } else {

                        next.prev = prev;
                        x.next = null;

                    }

                    x.value = null;

                    return true;
                }
            }
        }

        return false;
    }

}
