package com.example.threecardpoker;
import java.util.*;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.app.AlertDialog.Builder;

public class MainActivity extends AppCompatActivity {


    android.widget.Button deal_button;
    ImageView dealer_left, dealer_right, dealer_center, player_left, player_right, player_center;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        dealer_left = (ImageView) findViewById(R.id.dealers_left);
        dealer_right = (ImageView) findViewById(R.id.dealers_right);
        dealer_center = (ImageView) findViewById(R.id.dealers_center);
        player_left = (ImageView) findViewById(R.id.players_left);
        player_right = (ImageView) findViewById(R.id.players_right);
        player_center = (ImageView) findViewById(R.id.players_center);
        deal_button = (android.widget.Button) findViewById(R.id.deal_button);
        deal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            dealer_center.setImageResource(R.drawable.cardback);
                dealer_right.setImageResource(R.drawable.cardback);
                dealer_left.setImageResource(R.drawable.cardback);
                Deck deck = new Deck();
                deck.shuffle();
                Card card1 = deck.deal();
                Card card2 = deck.deal();
                Card card3 = deck.deal();
                Card card4 = deck.deal();
                Card card5 = deck.deal();
                Card card6 = deck.deal();
                Hand dealer_hand = new Hand();
                dealer_hand.insert_hand(card1);
                dealer_hand.insert_hand(card2);
                dealer_hand.insert_hand(card3);
                Hand player_hand = new Hand();
                player_hand.insert_hand(card4);
                player_hand.insert_hand(card5);
                player_hand.insert_hand(card6);
                int value1 = card4.getValue();
                int value2 = card5.getValue();
                int value3 = card6.getValue();
                String suit1 = card4.getSuit();
                String suit2 = card5.getSuit();
                String suit3 = card6.getSuit();
                String card_name1 = convertName(value1, suit1);
                String card_name2 = convertName(value2, suit2);
                String card_name3 = convertName(value3, suit3);
                player_left.setImageResource(getResources().getIdentifier(card_name1, "drawable", getPackageName()));
                player_center.setImageResource(getResources().getIdentifier(card_name2, "drawable", getPackageName()));
                player_right.setImageResource(getResources().getIdentifier(card_name3, "drawable", getPackageName()));

                int value4 = card1.getValue();
                int value5 = card2.getValue();
                int value6 = card3.getValue();
                String suit4 = card1.getSuit();
                String suit5 = card2.getSuit();
                String suit6 = card3.getSuit();
                String card_name4 = convertName(value4, suit4);
                String card_name5 = convertName(value5, suit5);
                String card_name6 = convertName(value6, suit6);
                dealer_left.setImageResource(getResources().getIdentifier(card_name4, "drawable", getPackageName()));
                dealer_center.setImageResource(getResources().getIdentifier(card_name5, "drawable", getPackageName()));
                dealer_right.setImageResource(getResources().getIdentifier(card_name6, "drawable", getPackageName()));
                android.app.AlertDialog alertDialog = new android.app.AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("You Lost");
                alertDialog.setMessage("You've gone bust");
                alertDialog.setButton(android.app.AlertDialog.BUTTON_NEUTRAL, "OK",
                        new android.content.DialogInterface.OnClickListener() {
                            public void onClick(android.content.DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
    }

    public String convertName(int val, String suit){
        String ret_string = "";
        if(val == 2)
            ret_string += "two";
        else if(val == 3)
            ret_string += "three";
        else if(val == 4)
            ret_string += "four";
        else if(val == 5)
            ret_string += "five";
        else if(val == 6)
            ret_string += "six";
        else if(val == 7)
            ret_string += "seven";
        else if(val == 8)
            ret_string += "eight";
        else if(val == 9)
            ret_string += "nine";
        else if(val == 10)
            ret_string += "ten";
        else if(val == 11)
            ret_string += "j";
        else if(val == 12)
            ret_string += "q";
        else if(val == 13)
            ret_string += "k";
        else if(val == 14)
            ret_string += "a";

        if(suit.equals("diamonds"))
            ret_string += "d";
        else if(suit.equals("clubs"))
            ret_string += "c";
        else if(suit.equals("hearts"))
            ret_string += "h";
        else if(suit.equals("spades"))
            ret_string += "s";

        return ret_string;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
