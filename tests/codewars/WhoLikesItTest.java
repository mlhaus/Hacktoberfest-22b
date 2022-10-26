package codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WhoLikesItTest {

    String[] names;
    @BeforeEach
    void setUp() {
        names = new String[]{"Brian", "Marilyn", "Pamela", "Timothy", "Jesse", "Heather", "Terry", "Carlos",
                "Bonnie", "Randy", "Lillian", "Emily", "Louis", "Chris", "Howard", "Helen", "Ralph", "Jennifer", "Mark", "Laura",
                "Jason", "Shirley", "Diane", "Phillip", "David", "Joan", "Wanda", "Jimmy", "Carl", "Betty", "Adam", "Lawrence",
                "Kathleen", "Mildred", "Rose", "Tina", "Jose", "Keith", "Janice", "Maria", "Kenneth", "Arthur", "James", "Catherine",
                "Henry", "Denise", "Ruby", "Cynthia", "Anthony", "Jeffrey", "Eugene", "Dorothy", "Lori", "Bobby", "Peter", "Alice",
                "Eric", "Wayne", "Phyllis", "Roger", "Clarence", "Scott", "John", "Philip", "Teresa", "Andrea", "Douglas", "Earl",
                "Melissa", "Benjamin", "Rebecca", "Michelle", "Alan", "Brenda", "William", "Frank", "Matthew", "George", "Anna",
                "Cheryl", "Roy", "Paula", "Tammy", "Gerald", "Christina", "Russell", "Kelly", "Albert", "Donna", "Todd", "Jessica",
                "Kimberly", "Johnny", "Dennis", "Jack", "Doris", "Martha", "Stephanie", "Stephen", "Christine"};

    }

    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        assertEquals("Brian, Marilyn and 98 others like this", WhoLikesIt.whoLikesIt(names));
    }

    @Test
    public void randomTests() {
        Random rand = new Random();
        for (int i = 0; i < 24; i++) {
            int r = rand.nextInt(100);
            String[] randNames = new String[r];
            for (int j = 0; j < r; j++) randNames[j] = names[rand.nextInt(100)];
            assertEquals(WhoLikesIt.whoLikesIt(randNames), WhoLikesIt.whoLikesIt(randNames));
        }
    }

    @Test
    public void GwenAdditionalTest() {
        assertTrue("no one likes this".equals(WhoLikesIt.whoLikesIt()));
        assertTrue("Gwen likes this".equals(WhoLikesIt.whoLikesIt("Gwen")));
        assertTrue("Gwen and Jaymes like this".equals(WhoLikesIt.whoLikesIt("Gwen", "Jaymes")));
        assertTrue("Gwen, Jaymes and Stephen like this".equals(WhoLikesIt.whoLikesIt("Gwen", "Jaymes", "Stephen")));
        assertTrue("Gwen, Jaymes and 2 others like this".equals(WhoLikesIt.whoLikesIt("Gwen", "Jaymes", "Stephen", "Franny")));
    }
}