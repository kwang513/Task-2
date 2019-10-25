package android.example.draft2;

import android.example.draft2.Food;
import android.example.draft2.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetailActivity extends AppCompatActivity {

    private ImageView detailImage;
    private TextView detailName;
    private TextView detailCost;
    private TextView detailDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_food_detail);

        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        long foodID = intent.getLongExtra("FoodID", 0);

        detailImage = findViewById(R.id.detailImage);
        detailName = findViewById(R.id.detailName);
        detailCost = findViewById(R.id.detailCost);
        detailDescription = findViewById(R.id.detailDescription);


    }
}
