package com.example.rogos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard=findViewById(R.id.card_view_starters);
        mainsCard=findViewById(R.id.card_view_main_course);
        dessertsCard=findViewById(R.id.card_view_dessert);


        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startersActivityIntent = new Intent(MainActivity.this,StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainCoursesActivityIntent = new Intent(MainActivity.this,MainCourseActivity.class);
                startActivity(mainCoursesActivityIntent);

            }
        });

        dessertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dessertActivityIntent = new Intent(MainActivity.this,DessertsActivity.class);
                startActivity(dessertActivityIntent);

            }
        });


    }

}