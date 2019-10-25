package android.example.draft2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.example.draft2.FoodDetailActivity;
import android.example.draft2.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    // Class variable that holds the data that we want to adapt
    private ArrayList<Food> foodArrayList;

    // This is basically a Setter that we use to give data to the adapter
    public void setData(ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }

    // ViewHolder represents one item, but doesn't have data when it's first constructed
    // We assign the data in onBindViewHolder
    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView imageView;
        public TextView textView;

        // This constructor is used in onCreateViewHolder
        public FoodViewHolder(View v) {
            super(v);
            view = v;
            imageView = v.findViewById(R.id.imageView);
            textView = v.findViewById(R.id.textView);

        }
    }

    public FoodAdapter(ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // First create a View from the layout file. It'll probably be a ViewGroup like
        // ConstraintLayout that contains more Views inside it.
        // This view now represents your entire one item.
        View v =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_food, parent, false);

        // Then create an instance of your custom ViewHolder with the View you got from inflating
        // the layout.
        FoodViewHolder foodViewHolder = new FoodViewHolder(v);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        // 'position' is the index of the ViewHolder currently being bound (note VIEWHOLDER). So
        // if position is 0, then we are binding the first ViewHolder in the list. This means the
        // corresponding data object will be at index 0 of our data ArrayList.
        final Food foodItem = foodArrayList.get(position);

        holder.imageView.setImageResource(foodItem.getImageURL());
        holder.textView.setText(foodItem.getName());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("FoodID", foodItem.getId());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }
}
