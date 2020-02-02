package com.example.biggernumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2;
    public static final Random RANDOM = new Random();
    // public static final int MAX_NUMBER = 9;
    // final TextView score = (TextView)findViewById(R.id.score);

    public static int count =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //   int count=0;

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setText(String.valueOf(RANDOM.nextInt(10)));
        button2.setText(String.valueOf(RANDOM.nextInt(10)));
        final TextView score = (TextView)findViewById(R.id.score);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((Integer.parseInt(button1.getText().toString())) >= Integer.parseInt(button2.getText().toString())){
                    count++;
                }else if((Integer.parseInt(button1.getText().toString())) < Integer.parseInt(button2.getText().toString())){
                    count--;
                }


                button1.setText(String.valueOf(RANDOM.nextInt(10)));
                if(count==11){
                    count=0;
                    score.setText("Score :"+count);
                }

                score.setText("Score: " + count);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((Integer.parseInt(button2.getText().toString())) >= Integer.parseInt(button1.getText().toString())){
                    count++;
                }else if((Integer.parseInt(button2.getText().toString())) < Integer.parseInt(button1.getText().toString())){
                    count--;
                }


                button2.setText(String.valueOf(RANDOM.nextInt(10)));

                if(count==11){
                    count=0;
                    score.setText("Score :"+count);
                }
                score.setText("Score: " + count);


            }
        });


    }
}
