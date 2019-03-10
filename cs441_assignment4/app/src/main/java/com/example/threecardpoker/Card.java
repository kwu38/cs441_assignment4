package com.example.threecardpoker;

import static java.lang.Integer.parseInt;

public class Card {
    public String name;
    public int value;


    public Card(String name)
    {
        name = name;

        char first_letter = name.charAt(0);
        if(first_letter == 'A')
            value = 14;
        if(first_letter == 'K')
            value = 13;
        if(first_letter == 'Q')
            value = 12;
        if(first_letter == 'J')
            value = 11;
        else value = parseInt(String.valueOf(first_letter));

    }

    public int getValue()
    {
        return value;
    }


}
