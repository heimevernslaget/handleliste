package roger.steinbakk.com.handleliste;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class GroceryViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private CheckBox checkbox;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.grocery_name_field);
        checkbox = itemView.findViewById(R.id.grocery_checkbox);
    }

    public void bind(Grocery grocery) {
        name.setText(grocery.getName());

        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(itemView.getContext(), "Checkbox trykket på!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
