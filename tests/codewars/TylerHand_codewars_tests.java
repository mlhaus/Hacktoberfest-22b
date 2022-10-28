package codewars;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


// tyler hands
public class TylerHand_codewars_tests {

        @Test
        public void testSomeUnderscoreLowerStart() {
            String input = "the_Stealth_Warrior";
            System.out.println("input: "+input);
            assertEquals("theStealthWarrior", TylerHand_codewars.toCamelCase(input));
        }
        @Test
        public void testSomeDashLowerStart() {
            String input = "the-Stealth-Warrior";
            System.out.println("input: "+input);
            assertEquals("theStealthWarrior", TylerHand_codewars.toCamelCase(input));
        }
        @Test
        public void testSomeDashUpperStart() {
            String input = "The-Best-Time-To-Wear-A-Striped-Sweater";
            System.out.println("input: "+input);
            assertEquals("TheBestTimeToWearAStripedSweater", TylerHand_codewars.toCamelCase(input));
        }
        @Test
        public void testSomeUnderscoreUpperStart() {
            String input = "The_Best_Time_To_Wear_A_Striped_Sweater";
            System.out.println("input: "+input);
            assertEquals("TheBestTimeToWearAStripedSweater", TylerHand_codewars.toCamelCase(input));
        }
    }

