package com.sunny.practice.restaurantorderform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;

/**
 * Design and validate the restaurant order form.
 * Use checkboxes and radio buttons.
 *
 * */
public class MainActivity extends AppCompatActivity {

    private TextView txt_restaurant_heading;
    private ListView lst_menu;
    private Button btn_order_complete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // display Heading
        txt_restaurant_heading = (TextView) findViewById(R.id.txt_restaurant_heading);
        txt_restaurant_heading.setText(R.string.rest_name);

        // Display List View: Menu List
        lst_menu = (ListView) findViewById(R.id.lst_menu);

        // Add list items to list using adapter
        lst_menu.setAdapter(new MenuItemsAdapter(this, Arrays.asList(getResources().getStringArray(R.array.items))));

        // add order complete button
        btn_order_complete = (Button) findViewById(R.id.btn_order_complete);
        btn_order_complete.setText(R.string.btn_order_complete);
        btn_order_complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayOrderSummary();
            }
        });

    }

    private void displayOrderSummary() {
//        lst_menu.getItemAtPosition()
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }


}
