package src;

import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCounterTest {

    @Test
    public void testSomething1() {
        assertEquals(true, LetterCounter.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, LetterCounter.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, LetterCounter.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, LetterCounter.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, LetterCounter.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, LetterCounter.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, LetterCounter.getXO("Xxxxertr34"));
    }

}