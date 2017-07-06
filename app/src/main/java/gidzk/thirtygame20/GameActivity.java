package gidzk.thirtygame20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import gidzk.thirtygame20.Model.Modelapp;

public class GameActivity extends AppCompatActivity implements Observer, View.OnClickListener {
    private Modelapp model;
    ArrayList<ImageButton> diceButtons;

    ImageButton dice1;
    ImageButton dice2;
    ImageButton dice3;
    ImageButton dice4;
    ImageButton dice5;
    ImageButton dice6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        model = new Modelapp();
        diceButtons = new ArrayList<>();
        wireDices();
        diceToList();
        setDiceFaces(model.getFaceVals());
        setClicklisteners(model.getFaceVals());


    }



    @Override
    public void update(Observable observable, Object o) {


    }

    @Override
    public void onClick(View view) {

    }







//-------- onCreate() Methods


    // ok tested
    private void setDiceFaces(ArrayList<Integer> faceVals) throws IndexOutOfBoundsException
    {

        int faceVal;
        int i = 0;
        for(ImageButton dice : diceButtons){
            faceVal = faceVals.get(i);

            if(faceVal == 1)
                dice.setImageResource(R.drawable.white1);
            if(faceVal == 2)
                dice.setImageResource(R.drawable.white2);
            if(faceVal == 3)
                dice.setImageResource(R.drawable.white3);
            if(faceVal == 4)
                dice.setImageResource(R.drawable.white4);
            if(faceVal == 5)
                dice.setImageResource(R.drawable.white5);
            if(faceVal == 6)
                dice.setImageResource(R.drawable.white6);
            i++;
        }



    }

    private void diceToList(){
        diceButtons.add(dice1);
        diceButtons.add(dice2);
        diceButtons.add(dice3);
        diceButtons.add(dice4);
        diceButtons.add(dice5);
        diceButtons.add(dice6);

    }


    private void setClicklisteners(final ArrayList<Integer> faceVals){
        dice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.onClickedDice1();
                dice1.setImageResource(R.drawable.grey1);

            }
        });

    }

    private void wireDices()
    {
        dice1 = (ImageButton) findViewById(R.id.dice_button_1);
        dice2 = (ImageButton) findViewById(R.id.dice_button_2);
        dice3 = (ImageButton) findViewById(R.id.dice_button_3);
        dice4 = (ImageButton) findViewById(R.id.dice_button_4);
        dice5 = (ImageButton) findViewById(R.id.dice_button_5);
        dice6 = (ImageButton) findViewById(R.id.dice_button_6);

    }
}
