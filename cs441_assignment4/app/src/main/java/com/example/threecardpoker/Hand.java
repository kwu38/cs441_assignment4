package com.example.threecardpoker;
import java.util.*;
public class Hand {

    private ArrayList<Card> hand = new ArrayList<Card>();
    private boolean low_kicker, high_kicker;
    private int rank;

    public int getRank()
    {
        return rank;
    }

    public void insert_hand(Card c)
    {
        hand.add(c);
        Collections.sort(hand);
    }
    public void setRank()
    {
        if(this.isStraightFlush())
            rank = 10;
        else if(this.hasSet())
            rank = 9;
        else if(this.isStraight())
            rank = 8;
        else if(this.isFlush())
            rank = 7;
        else if(this.hasPair())
            rank = 6;
        else
            rank = 5;
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
        if(value == hand.get(1).getValue() && value != hand.get(2).getValue()) {
            ret = true;
            high_kicker = true;
        }
        else if(value != hand.get(1).getValue() && hand.get(1).getValue() == hand.get(2).getValue()){
            ret = true;
            low_kicker = true;
        }
        return ret;

    }

    public int getHighCard()
    {
        return hand.get(2).getValue();
    }

    public int getPair()
    {
        if(high_kicker)
            return hand.get(0).getValue();
        return hand.get(2).getValue();
    }
    public int getKicker()
    {
            if (high_kicker)
                return hand.get(2).getValue();
            return hand.get(0).getValue();
    }

    public boolean determineWinner(Hand h)
    {
        boolean won = false;

        return won;
    }



}
