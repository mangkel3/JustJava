package com.afradadmedia.android.justjava;

import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }
   
   public void submitOrder(View view) {
       display(1);
   }
   
   private void display(int number) {
       TextView quantityTextView = 
           (TextView) findViewById(R.id.quantity_text_view);
       quantityTextView.setText("" + number);
   }
   
}
