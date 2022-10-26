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
    void april_testPeek(){
        OurLinkedList<String> list2 = new OurLinkedList<>();
        list2.add("pizza");
        list2.add("chicken wings");
        list2.add("french fries");
        assertEquals("pizza", list2.peek());
    }

    @Test
    void class_testRemove(){
        OurLinkedList<String> list3 = new OurLinkedList<>();
        list3.add("Reese's");
        list3.add("Skittles");
        list3.add("Peanut Butter M&Ms");
        assertEquals("Reese's", list3.remove());
        assertEquals("Skittles", list3.remove());
        assertEquals("Peanut Butter M&Ms", list3.get(0));
    }
}