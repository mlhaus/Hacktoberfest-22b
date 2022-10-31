package codegym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
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

    @Test
    void testGetFirst(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals("pizza", list.getFirst());

        OurLinkedList<String> list2 = new OurLinkedList<>();
        assertThrows(NoSuchElementException.class, () -> list2.getFirst());
    }

    @Test
    void marc_remove() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Reese's");
        list.add("Skittles");
        list.add("Peanut Butter M&Ms");
        assertEquals("Reese's", list.remove());
        assertEquals("Skittles", list.remove());
        assertEquals("Peanut Butter M&Ms", list.get(0));
    }

    @Test
    void poll() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals(list.poll(),"pizza");
    }

    @Test
    void testRemove() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        String remove1 = list.remove();

        assertEquals(remove1, "pizza");

    }

    @Test
    void testSize() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals(3, list.size());
        OurLinkedList<String> list2 = new OurLinkedList<>();
        assertEquals(0, list2.size());
    }

    @Test
    void testToArrayParameterised() {
        LocalDate firstTime = LocalDate.of(1998,9,27);
        LocalDate secondTime = LocalDate.of(1999,12,15);
        LocalDate thirdTime = LocalDate.now();
        OurLinkedList<LocalDate> dates = new OurLinkedList<>();
        dates.add(firstTime);
        dates.add(secondTime);
        dates.add(thirdTime);

        LocalDate[] datesArray = dates.toArray(new LocalDate[0]);

        assertEquals(firstTime, datesArray[0]);
        assertEquals(secondTime, datesArray[1]);
        assertEquals(thirdTime, datesArray[2]);
    }

    @Test
    void rith_removeValue(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");    
        list.remove("pizza");
        list.remove("soda");
        assertEquals("chicken wings",list.get(0));
        assertEquals("french fries",list.get(1));

        list.add("soda");
        list.remove("french fries");
        assertEquals("soda",list.get(1));

    }




    @Test
    void gwenTestOfferFirst() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Java");
        list.add("Python");
        list.offerFirst("C#");
        assertTrue(list.get(0).equals("C#"));
        assertTrue(list.get(1).equals("Java"));
        assertTrue(list.get(2).equals("Python"));
    }

    @Test
    void testContains(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertTrue(list.contains("pizza"));
        assertTrue(list.contains("french fries"));
        assertTrue(list.contains("chicken wings"));
        assertFalse(list.contains("PIZZA"));
        assertFalse(list.contains("burger"));

    }

    @Test
    void andy_testPeekLast(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        OurLinkedList<Integer> list2 = new OurLinkedList<>();
        // test that the correct value is returned
        assertEquals("french fries", list.peekLast());
        // test that the last value was not removed from the list
        assertEquals("french fries", list.get(2));
        // test that null is returned if the list is empty
        assertNull(list2.peekLast());
    }

    @Test
    void john_TestOffer(){
        OurLinkedList<Integer> list = new OurLinkedList<>();
        boolean test1 = list.offer(4);
        boolean test2 = list.offer(3);
        boolean test3 = list.offer(100000);
        // Test returns
        assertTrue(test1);
        assertTrue(test2);
        assertTrue(test3);
        // Test placements
        assertEquals(4,list.get(0));
        assertEquals(3,list.get(1));
        assertEquals(100000, list.get(2));

    }

    @Test
    void testRemoveLast() {
        OurLinkedList<String> stringList = new OurLinkedList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        stringList.add("Fourth");
        stringList.add("Fifth");
        String lastString = stringList.removeLast();
        // Check that string extracted is indeed the last string in the array
        assertEquals("Fifth", lastString);
        // Check to see if calling the fifth location in a list returns an exception since it shouldn't exist.
        assertThrows(Exception.class, () -> { stringList.get(5); });
    }

    @Test
    void testGetLast() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        assertEquals("five", list.getLast());
        OurLinkedList<String> list2 = new OurLinkedList<>();
        assertThrows(NoSuchElementException.class, () -> list2.getLast());
    }
    
}
