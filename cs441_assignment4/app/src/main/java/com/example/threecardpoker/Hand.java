package com.example.threecardpoker;
import java.util.*;
public class Hand {

    public ArrayList<Card> hand = new ArrayList<Card>();

    public void insert_hand(Card c)
    {
        hand.add(c);
    }

    public boolean isFlush()
    {
        Boolean ret = true;
        String suit = hand.get(0).getSuit();
        for(int i = 1; i < hand.size(); i++)
        {
            if(suit != hand.get(i).getSuit())
                ret = false;
        }
        return ret;
    }

    public boolean isStraight()
    {
        Boolean ret = true;
        int value = hand.get(0).getValue();
    }


}
