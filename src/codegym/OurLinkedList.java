package codegym;

public class OurLinkedList<T> {
    private Node<T> first = new Node<>();
    private Node<T> last = new Node<>();
    public Node<T> getFirst(){
        return first;
    }
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
    }

    public void addFirst(T obj) {
//        Inserts the specified element at the beginning of this list.
        Node currentElement = first.next;
        int count = 0;
        while ((currentElement) != null) {
            if(count == 0){
                if(first.getValue() == null){
                    // To handle the case where first is null.  See the add method above.
                    Node node = new Node();
                    node.value = obj;
                    first = node;
                    first.next = currentElement;
                    currentElement.prev = first;
                } else {
                    // To handle the case where first is not null.
                    Node node = new Node();
                    node.value = obj;
                    first = node;
                    first.next = currentElement.prev;
                    currentElement.prev = first;
                }
            }
            currentElement = currentElement.next;
            count++;
        }
    }

    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
        public T getValue(){
            return this.value;
        }
        public Node getNext(){
            return this.next;
        }
        public Node getPrev(){
            return this.prev;
        }
    }
}
