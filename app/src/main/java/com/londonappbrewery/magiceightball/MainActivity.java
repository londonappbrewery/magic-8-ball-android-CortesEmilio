package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   final int [] ballArray = {
           R.drawable.ball1,
           R.drawable.ball2,
           R.drawable.ball3,
           R.drawable.ball4,
           R.drawable.ball5,



         };
   final ImageView ball;
   final Button spinButton;
   spinButton = findViewById(R.id.spinButton);
   ball = findViewById(R.id.ball);
        spinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("MagicEightBall", "The button has been pressed: ");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                Log.d("DICEEY", "Your number is: " + number);
                Random randomNumberGenerator2 = new Random();
                ball.setImageResource(ballArray[number]);

            }
        });
    }
}
