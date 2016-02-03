package com.afradadmedia.android.justjava;

import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;

import java.text.*;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }

   public void increment(View view) {
      int quantity = 2;
      quantity = quantity + 1;
      quantity = quantity + 1;
      quantity = quantity + 1;
      quantity = quantity + 1;
      display(quantity);
   }

   public void decrement(View view) {
      int quantity = 2;
      quantity = quantity - 1;
      quantity = quantity - 1;
      display(quantity);
   }

   public void submitOrder(View view) {
      int quantity = 5;
      display(quantity);
      displayPrice(quantity * 5);
   }

   private void display(int number) {
      TextView quantityTextView =
         (TextView) findViewById(R.id.quantity_text_view);
      quantityTextView.setText("" + number);
   }

   private void displayPrice(int number) {
      TextView priceTextView =
         (TextView) findViewById(R.id.price_text_view);
      priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
   }

}
