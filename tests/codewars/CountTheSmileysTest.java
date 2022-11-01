package codewars;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheSmileysTest {

    @Test
    public void smileyTest() {
        List<String> list = new ArrayList<>();
        list.add(":)");
        list.add(";-p");
        list.add(":D");
        list.add(":-}");
        list.add(":-()");
        list.add("XD");
        list.add(":o");
        list.add(";0");
        assertEquals(2, SmileFaces.countSmileys(list));

    }
}
