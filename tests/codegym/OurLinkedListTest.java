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
    void mohmeedremoveFirst() {
    }
    @Test
    void testAdd() {
    }
    @Test
    void mohmeed_remove() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Reeses");
        list.add("shkjkfn");
        list.add("fojfpf");

    }
}