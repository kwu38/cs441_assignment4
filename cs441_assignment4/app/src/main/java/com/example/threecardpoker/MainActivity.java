package com.example.threecardpoker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static void main()
    {
        Card c1 = new Card("2H");
        Card c2 = new Card("3H");
        Card c3 = new Card("4H");
        Hand hand1 = new Hand();
        hand1.insert_hand(c1);
        hand1.insert_hand(c2);
        hand1.insert_hand(c3);
        if(hand1.isStraightFlush())
            System.out.println("Has Straight Flush");
    }
    android.widget.Button deal_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

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
