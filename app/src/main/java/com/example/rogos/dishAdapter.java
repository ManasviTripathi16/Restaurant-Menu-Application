package com.example.rogos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class dishAdapter extends RecyclerView.Adapter<dishAdapter.ViewHolder> {

    private Dish[] dishes;

    public dishAdapter(Dish[] dishes) {
        this.dishes = dishes;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView priceTextView;
        public TextView descriptionTextView;

        public ViewHolder(View view) {
            super(view);
            titleTextView = view.findViewById(R.id.title_text_view);
            descriptionTextView = view.findViewById(R.id.description_text_view);
            priceTextView = view.findViewById(R.id.price_text_view);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dish dish = dishes[position];
        holder.titleTextView.setText(dish.title);
        holder.descriptionTextView.setText(dish.description);
        holder.priceTextView.setText(String.format("Rs %d", dish.price));
    }

    @Override
    public int getItemCount() {
        return dishes.length;
    }
}
