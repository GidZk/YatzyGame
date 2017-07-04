package gidzk.thirtygame20;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class StartUpActivity extends AppCompatActivity implements View.OnClickListener {
    private Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        playButton = (Button) findViewById(R.id.PlayButton);
        playButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent startGameIntent = new Intent(this, GameActivity.class);
        startActivity(startGameIntent);

    }

}
