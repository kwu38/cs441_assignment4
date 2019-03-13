package com.example.threecardpoker;
import java.util.*;

public class Deck {

    public ArrayList<Card> deck_of_cards = new ArrayList<Card>();

    public Deck()
    {
        Card card1 = new Card("2D");
        Card card2 = new Card("2S");
        Card card3 = new Card("2H");
        Card card4 = new Card("2C");
        Card card5 = new Card("3D");
        Card card6 = new Card("3S");
        Card card7 = new Card("3H");
        Card card8 = new Card("3C");
        Card card9 = new Card("4D");
        Card card10 = new Card("4S");
        Card card11 = new Card("4H");
        Card card12 = new Card("4C");
        Card card13 = new Card("5D");
        Card card14 = new Card("5S");
        Card card15 = new Card("5H");
        Card card16 = new Card("5C");
        Card card17 = new Card("6D");
        Card card18 = new Card("6S");
        Card card19 = new Card("6H");
        Card card20 = new Card("6C");
        Card card21 = new Card("7D");
        Card card22 = new Card("7S");
        Card card23 = new Card("7H");
        Card card24 = new Card("7C");
        Card card25 = new Card("8D");
        Card card26 = new Card("8S");
        Card card27 = new Card("8H");
        Card card28 = new Card("8C");
        Card card29 = new Card("9D");
        Card card30 = new Card("9S");
        Card card31 = new Card("9H");
        Card card32 = new Card("9C");
        Card card33 = new Card("10D");
        Card card34 = new Card("10S");
        Card card35 = new Card("10H");
        Card card36 = new Card("10C");
        Card card37 = new Card("JD");
        Card card38 = new Card("JS");
        Card card39 = new Card("JH");
        Card card40 = new Card("JC");
        Card card41 = new Card("QD");
        Card card42 = new Card("QS");
        Card card43 = new Card("QH");
        Card card44 = new Card("QC");
        Card card45 = new Card("KD");
        Card card46 = new Card("KS");
        Card card47 = new Card("KH");
        Card card48 = new Card("KC");
        Card card49 = new Card("AD");
        Card card50 = new Card("AS");
        Card card51 = new Card("AH");
        Card card52 = new Card("AC");
        deck_of_cards.add(card1);
        deck_of_cards.add(card2);
        deck_of_cards.add(card3);
        deck_of_cards.add(card4);
        deck_of_cards.add(card5);
        deck_of_cards.add(card6);
        deck_of_cards.add(card7);
        deck_of_cards.add(card8);
        deck_of_cards.add(card9);
        deck_of_cards.add(card10);
        deck_of_cards.add(card11);
        deck_of_cards.add(card12);
        deck_of_cards.add(card13);
        deck_of_cards.add(card14);
        deck_of_cards.add(card15);
        deck_of_cards.add(card16);
        deck_of_cards.add(card17);
        deck_of_cards.add(card18);
        deck_of_cards.add(card19);
        deck_of_cards.add(card20);
        deck_of_cards.add(card21);
        deck_of_cards.add(card22);
        deck_of_cards.add(card23);
        deck_of_cards.add(card24);
        deck_of_cards.add(card25);
        deck_of_cards.add(card26);
        deck_of_cards.add(card27);
        deck_of_cards.add(card28);
        deck_of_cards.add(card29);
        deck_of_cards.add(card30);
        deck_of_cards.add(card31);
        deck_of_cards.add(card32);
        deck_of_cards.add(card33);
        deck_of_cards.add(card34);
        deck_of_cards.add(card35);
        deck_of_cards.add(card36);
        deck_of_cards.add(card37);
        deck_of_cards.add(card38);
        deck_of_cards.add(card39);
        deck_of_cards.add(card40);
        deck_of_cards.add(card41);
        deck_of_cards.add(card42);
        deck_of_cards.add(card43);
        deck_of_cards.add(card44);
        deck_of_cards.add(card45);
        deck_of_cards.add(card46);
        deck_of_cards.add(card47);
        deck_of_cards.add(card48);
        deck_of_cards.add(card49);
        deck_of_cards.add(card50);
        deck_of_cards.add(card51);
        deck_of_cards.add(card52);
    }

    public void shuffle()
    {
        Collections.shuffle(deck_of_cards);
    }

    public void deal()
    {
        Card top_card = deck_of_cards.remove(0);
    }




}
