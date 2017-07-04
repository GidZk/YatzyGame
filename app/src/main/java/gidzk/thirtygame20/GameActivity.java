package gidzk.thirtygame20;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Observable;
import java.util.Observer;

import gidzk.thirtygame20.Model.Modelapp;

public class GameActivity extends AppCompatActivity implements Observer, View.OnClickListener {
    private Modelapp model;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }






    @Override
    public void update(Observable observable, Object o) {

    }

    @Override
    public void onClick(View view) {


    }
}
