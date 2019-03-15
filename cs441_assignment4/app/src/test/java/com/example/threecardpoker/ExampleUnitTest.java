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
        Card c1 = new Card("2S");
        Card c2 = new Card("2D");
        Card c3 = new Card("AC");
        Hand hand1 = new Hand();
        hand1.insert_hand(c1);
        hand1.insert_hand(c2);
        hand1.insert_hand(c3);
        hand1.setRank();
        Card c4 = new Card("5H");
        Card c5 = new Card("5D");
        Card c6 = new Card("2H");
        Hand hand2 = new Hand();
        hand2.insert_hand(c4);
        hand2.insert_hand(c5);
        hand2.insert_hand(c6);
        hand2.setRank();
        boolean bool = hand1.getRank() < hand2.getRank();
         assertEquals(true, bool);
    }

}