package codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {
    @Test
    void add() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals("pizza", list.get(0));
        assertEquals("chicken wings", list.get(1));
        assertEquals("french fries", list.get(2));

    }

    @Test
    void testAdd() {
    }

    @Test
    void ethanm_testAddFirst() {
        // Test to see if the first new node has a value that was added
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        list.addFirst("donut");
        list.addFirst("pretzel");
        assertEquals("pretzel", list.get(0));
        // Test to see if old first node is the next node for the new first node
        assertEquals("donut", list.get(1));
        // Test to see if the new first node is previous for the old first node
    }
}