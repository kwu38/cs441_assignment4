package com.example.threecardpoker;
import java.util.*;
public class Hand {

    public ArrayList<Card> hand = new ArrayList<Card>();

    public void insert_hand(Card c)
    {
        hand.add(c);
        Collections.sort(hand);
    }

    public boolean isFlush()
    {
        Boolean ret = true;
        String suit = hand.get(0).getSuit();
        for(int i = 1; i < hand.size(); i++)
        {
            Card current = hand.get(i);
            if(suit != current.getSuit())
                ret = false;
        }
        return ret;
    }

    public boolean isStraight()
    {
        Boolean ret = true;
        int value = hand.get(0).getValue();
        for(int i = 1; i < hand.size(); i++)
        {
            Card current = hand.get(i);
            if(current.getValue() != value + 1){
                ret = false;
                break;
            }
            value = current.getValue();
        }
        return ret;
    }

    public boolean isStraightFlush()
    {
        if(this.isFlush() && this.isStraight())
            return true;
        return false;
    }

    public boolean hasSet()
    {
        boolean ret = true;
        int value = hand.get(0).getValue();
        for(int i = 1; i < hand.size(); i++)
        {
            Card current = hand.get(i);
            if(value != current.getValue())
                ret = false;
        }
        return ret;

    }

    public boolean hasPair()
    {
        boolean ret = false;
        int value = hand.get(0).getValue();
        if(value == hand.get(1).getValue() && value != hand.get(2).getValue())
            ret = true;
        if(value != hand.get(1).getValue() && hand.get(1).getValue() == hand.get(2).getValue())
            ret = true;
        return ret;

    }



}
