package codegym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    private OurLinkedList<String> testList;

    @BeforeEach
    void setUp() {
        testList = new OurLinkedList<String>();
        testList.add("Test Item 1");
        testList.add("Test Item 2");
        testList.add("Test Item 3");
    }

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
    void get() {
        assertEquals("Test Item 1", testList.get(0));
        assertEquals("Test Item 2", testList.get(1));
        assertEquals("Test Item 3", testList.get(2));
    }

    @Test
    void peek() {
        assertEquals("Test Item 1", testList.peek());
    }

    @Test
    void remove() {
        assertEquals("Test Item 1", testList.peek());
        testList.remove();

        assertEquals("Test Item 2", testList.peek());
        testList.remove();

        assertEquals("Test Item 3", testList.peek());
        testList.remove();
        // All items removed, testList is empty
        assertEquals(null, testList.peek());
        // testList can still be added to
        testList.add("Test Item 4");
        assertEquals("Test Item 4", testList.peek());

        testList.remove();
        assertEquals(null, testList.peek());
        // Removing from an empty list should throw an exception
        assertThrows(NoSuchElementException.class, () -> testList.remove());
        // Make sure testList structure survives after exception
        testList.add("Test Item 5");
        assertEquals("Test Item 5", testList.peek());

        testList.remove();
        assertEquals(null, testList.peek());
    }

    @Test
    void pop() {
        assertEquals("Test Item 1", testList.peek());
        assertEquals("Test Item 1", testList.pop());
        assertEquals("Test Item 2", testList.peek());
        assertEquals("Test Item 2", testList.pop());
        assertEquals("Test Item 3", testList.peek());
        assertEquals("Test Item 3", testList.pop());
        assertThrows(NoSuchElementException.class, () -> testList.pop());
    }

    @Test
    void pollFirst() {
        assertEquals("Test Item 1", testList.peek());
        assertEquals("Test Item 1", testList.pollFirst());
        assertEquals("Test Item 2", testList.peek());
        assertEquals("Test Item 2", testList.pollFirst());
        assertEquals("Test Item 3", testList.peek());
        assertEquals("Test Item 3", testList.pollFirst());
        assertEquals(null, testList.peek());
        assertEquals(null, testList.pollFirst());

    }
}