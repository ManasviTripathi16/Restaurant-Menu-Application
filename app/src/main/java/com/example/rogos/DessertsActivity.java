package com.example.rogos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        RecyclerView dessertsList = findViewById(R.id.recycler_view_dessert);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        dessertsList.setLayoutManager(linearLayoutManager);


        Dish dishes[]={new Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
                new Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
                new Dish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 599),
                new Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
                new Dish("Hot Chocolate Fudge", "Decadent chocolate fudge served hot.", 399),
                new Dish("Fruit Salad Sundae", "Fresh and colorful fruit salad served in a sundae glass.", 499),
                new Dish("Sizzling Brownie", "Warm chocolate brownie served with sizzling ice cream", 599),
                new Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 499)
        };

        dishAdapter DishAdapter = new dishAdapter(dishes);
        dessertsList.setAdapter(DishAdapter);
    }
}