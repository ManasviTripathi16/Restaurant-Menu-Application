package com.example.rogos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        RecyclerView startersList = findViewById(R.id.recycler_view_starters);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        startersList.setLayoutManager(layoutManager);
        Log.d("StartersActivity", "Found RecyclerView with ID: " + startersList.getId());

        Dish[] dishes = {new Dish("Kakori Kebabs", "Spiced and juicy minced meat kebabs", 699),
                new Dish("Mughlai Paneer Tikka", "Soft and creamy marinated cottage cheese skewers", 899),
                new Dish("Baked Chicken Seekh", "Spiced and flavorful baked chicken kebabs", 799),
                new Dish("Dahi Kebabs", "Creamy and tangy vegetarian kebabs made with yogurt", 899),
                new Dish("Khandvi", "Soft and silky vegetarian rolls made with gram flour", 599),
                new Dish("Aloo Cheese Croquettes", "Crispy fried potato and cheese balls", 499),
                new Dish("Spring Rolls", " Crispy and savory vegetable rolls", 599),
                new Dish("Chilli Potato", "Spicy and tangy potato stir-fry", 799),
                new Dish("French Fries","Classic deep-fried potato fries",599),
                new Dish("Mini Pizza","Small and delicious personal-sized pizza",999)};
        Log.d("StartersActivity", "Created array of dishes with length: " + dishes.length);

        dishAdapter DishAdapter = new dishAdapter(dishes);
        startersList.setAdapter(DishAdapter);
    }



}
