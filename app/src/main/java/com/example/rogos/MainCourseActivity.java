package com.example.rogos;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainCourseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);

        RecyclerView mainCourseList = findViewById(R.id.recycler_view_main_course);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mainCourseList.setLayoutManager(linearLayoutManager);
        Dish[] dishesMainCourse ={new Dish("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new Dish("Veg Chopsuey", "Crispy veggie noodles in savory sauce", 599),
                new Dish("Chilly Paneer Gravy", "Spicy Indo-Chinese paneer in gravy.", 599),
                new Dish("Veg Hakka Noodles", "Spicy veggie noodles, Indo-Chinese style", 499),
                new Dish("Chilli Garlic Noodles", "Garlicky, spicy, and flavorful noodles", 599),
                new Dish("Shahi Paneer", "Rich and creamy cottage cheese curry", 599),
                new Dish("Kadhai Paneer ", "Spicy and tangy cottage cheese stir-fry", 599),
                new Dish("Paneer Butter Masala", "Creamy tomato-based cottage cheese curry", 599),
                new Dish("Mushroom Masala", "Spicy and savory mushroom curry", 499),
                new Dish("Malai Kofta", "Cottage cheese balls in creamy gravy", 499),
                new Dish("Dal Makhani", "Slow-cooked black lentils in tomato sauce", 499),
                new Dish("Yellow Dal", "Mild and comforting yellow lentil soup", 399),
                new Dish("Tandoori Roti", "Traditional Indian baked flatbread", 99),
                new Dish("Roomali Roti", "Thin and soft Indian flatbread", 125),
                new Dish("Butter Roti", "Soft and buttery Indian flatbread", 125),
                new Dish("Butter Naan", "Soft and buttery leavened bread", 150),
                new Dish("Garlic Naan Butter", "Garlic-flavored buttery leavened bread", 160),
                new Dish("Stuffed Kulcha (Aloo)", "Leavened bread stuffed with spiced potatoes.", 150),
                new Dish("Steam Rice", "Light and fluffy steamed white rice", 399),
                new Dish("Jeera Pulao", "Cumin-flavored basmati rice", 499),
                new Dish("Mix Veg. Pulao", "Basmati rice cooked with mixed veggies", 599)
        };

        dishAdapter DishAdapter=new dishAdapter(dishesMainCourse);
        mainCourseList.setAdapter(DishAdapter);


    }
}
