package com.thakas.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button rollButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });
    }

    private void roll() {
        int rollNummber = (int)(Math.random() * 6 + 1);
        ImageView diceImage = findViewById(R.id.imageView);

        switch (rollNummber){
            case 1:
                diceImage.setImageResource(R.drawable.dice_1);
                Toast.makeText(this, "one", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                diceImage.setImageResource(R.drawable.dice_2);
                Toast.makeText(this, "two", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                diceImage.setImageResource(R.drawable.dice_3);
                Toast.makeText(this, "three", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                diceImage.setImageResource(R.drawable.dice_4);
                Toast.makeText(this, "four", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                diceImage.setImageResource(R.drawable.dice_5);
                Toast.makeText(this, "five", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                diceImage.setImageResource(R.drawable.dice_6);
                Toast.makeText(this, "six", Toast.LENGTH_SHORT).show();
                break;
                default:
                    diceImage.setImageResource(R.drawable.empty_dice);
        }
    }
}
