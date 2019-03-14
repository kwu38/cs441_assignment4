package com.example.threecardpoker;

import static java.lang.Integer.parseInt;

public class Card implements Comparable<Card>{
    private String name, suit;
    private int value;


    public Card(String name)
    {
        this.name = name;

        char first_letter = name.charAt(0);
        char second_letter = name.charAt(1);
        if(first_letter == 'A')
            value = 14;
        else if(first_letter == 'K')
            value = 13;
        else if(first_letter == 'Q')
            value = 12;
        else if(first_letter == 'J')
            value = 11;
        else if(first_letter == 'T')
            value = 10;
        else value = parseInt(String.valueOf(first_letter));

        if(second_letter == 'D')
            suit = "diamond";
        if(second_letter == 'C')
            suit = "clubs";
        if(second_letter == 'H')
            suit = "hearts";
        if(second_letter == 'S')
            suit = "spades";

    }

    public int getValue()
    {
        return value;
    }
    public String getSuit()
    {
        return suit;
    }

    @Override
    public int compareTo(Card c)
    {
        int compare_value = c.getValue();
        return this.value - compare_value;
    }

}
