package miwok.android.example.com.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView testButton = findViewById(R.id.testButton);
        testButton.setOnClickListener(v -> {

        });


        TextView numsButton = findViewById(R.id.numbers);
        numsButton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(i);
        });


        TextView familyButton = findViewById(R.id.family);
        familyButton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, FamilyActivity.class);
            startActivity(i);
        });


        TextView colorsButton = findViewById(R.id.colors);
        colorsButton.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, ColorsActivity.class);
            startActivity(i);
        });


        TextView phrasesButton = findViewById(R.id.phrases);
        phrasesButton.setOnClickListener(v -> {
            Intent i = new Intent(this, PhrasesActivity.class);
            startActivity(i);
        });


    }

}
