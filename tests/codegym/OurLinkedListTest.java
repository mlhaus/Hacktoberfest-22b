package codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OurLinkedListTest {
    @Test
    void add(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals("pizza", list.get(0));
        assertEquals("chicken wings", list.get(1));
        assertEquals("french fries", list.get(2));

    }

    @Test
    void peek(){
        OurLinkedList<String> list2 = new OurLinkedList<>();
        list2.add("pizza");
        list2.add("chicken wings");
        list2.add("french fries");
        assertEquals("pizza", list2.peek());
    }
}