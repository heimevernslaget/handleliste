package roger.steinbakk.com.handleliste;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Grocery> groceryList;

    public ShoppingListAdapter(List<Grocery> groceries) {
        groceryList = groceries;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grocery_item, viewGroup, false);

        return new GroceryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((GroceryViewHolder)viewHolder).bind(groceryList.get(position));
    }

    @Override
    public int getItemCount() {
        return groceryList.size();
    }

    public void addItem(Grocery item) {
        //TODO add item to groceryList and call:
        //notifyItemInserted(groceryList.size());
    }

    public void setItems(List<Grocery> groceryList) {
        this.groceryList.clear();
        this.groceryList.addAll(groceryList);
        notifyDataSetChanged();
    }
}
