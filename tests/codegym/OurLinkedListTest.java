package codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    @Test
    void mohmeedadd() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals("pizza", list.get(0));
        assertEquals("chicken wings", list.get(1));
        assertEquals("french fries", list.get(2));

    }
    @Test
    void mohmeed_removeFirst() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Mohmeed");
        list.add("Ahmed");
        list.add("Ali");
        assertEquals("Mohmeed", list.removeFirst());
    }
    @Test
    void testAdd() {
    }
    @Test
    void mohmeed_remove() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Reeses");
        list.add("skittles");
        list.add("peanut butter");
        assertEquals("Reeses", list.remove());
        assertEquals("skittles", list.remove());
        assertEquals("peanut butter", list.remove());


    }
}