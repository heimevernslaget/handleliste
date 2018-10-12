package roger.steinbakk.com.handleliste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button addGroceryButton;
    private EditText groceryNameInput;

    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addGroceryButton = findViewById(R.id.addBtn);
        groceryNameInput = findViewById(R.id.add_item_input);

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new ShoppingListAdapter(getShoppingList());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        initAddGrocery();
    }

    private void initAddGrocery() {
        addGroceryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Todo: Should add a grocery!", Toast.LENGTH_SHORT).show();
                //TODO:
                /*
                get text from EditText
                create grocery
                add grocery to adapter
                 */

                /* søk om SharedPreferences lagre data på en enkel måte, ikke like sikkert som database */
            }
        });
    }

    private List<Grocery> getShoppingList() {
        List<Grocery> shoppingList = new ArrayList<>();
        Grocery lettmelk = new Grocery("Lettmelk");
        Grocery chokolade = new Grocery("Sjokolade");
        shoppingList.add(lettmelk);
        shoppingList.add(chokolade);

        return shoppingList;
    }
}
