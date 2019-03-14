package com.example.threecardpoker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Card c1 = new Card("KD");
        Card c2 = new Card("AC");
        Card c3 = new Card("QH");
        Hand hand1 = new Hand();
        hand1.insert_hand(c1);
        hand1.insert_hand(c2);
        hand1.insert_hand(c3);
        boolean bool = hand1.isStraight();
         assertEquals(true, bool);
    }

}