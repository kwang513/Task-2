package android.example.draft2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Food> foodArrayList;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createFoodList();
        buildRecyclerView();

    }

    public void createFoodList() {
        foodArrayList = new ArrayList<>();
        foodArrayList.add(new Food("Apple Pie", R.drawable.apple_pie));
        foodArrayList.add(new Food("Bacon Burger", R.drawable.bacon_burger));
        foodArrayList.add(new Food("Beef Burger", R.drawable.beef_burger));
        foodArrayList.add(new Food("Cheese Burger", R.drawable.cheese_burger));
        foodArrayList.add(new Food("Chicken Burger", R.drawable.chicken_burger));
        foodArrayList.add(new Food("Chicken Nuggets", R.drawable.chicken_nuggets));
        foodArrayList.add(new Food("Chocolate Milk", R.drawable.chocolate_milk));
        foodArrayList.add(new Food("Coke", R.drawable.coke));
        foodArrayList.add(new Food("Diet Coke", R.drawable.diet_coke));
        foodArrayList.add(new Food("Fish Burger", R.drawable.fish_burger));
        foodArrayList.add(new Food("French Fries", R.drawable.french_fries));
        foodArrayList.add(new Food("Iced Coffee", R.drawable.iced_coffee));
        foodArrayList.add(new Food("Iced Tea", R.drawable.iced_tea));
        foodArrayList.add(new Food("Onion Rings", R.drawable.onion_rings));
        foodArrayList.add(new Food("Salad", R.drawable.salad));
        foodArrayList.add(new Food("Sprite", R.drawable.sprite));
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new FoodAdapter(foodArrayList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
