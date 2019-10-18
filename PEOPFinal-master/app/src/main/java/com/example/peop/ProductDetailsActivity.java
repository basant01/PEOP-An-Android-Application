package com.example.peop;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.peop.Model.Products;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class ProductDetailsActivity extends AppCompatActivity {

    private ImageView productimage;
    private TextView productname,productdescition,productprice;
    private String productID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        productID = getIntent().getStringExtra("pid");
        productimage = (ImageView) findViewById(R.id.product_image_details);
        productdescition = (TextView) findViewById(R.id.product_description);
        productname = (TextView) findViewById(R.id.product_name);
        productprice= (TextView) findViewById(R.id.product_price);

     getProductDetails(productID);
    }

    private void getProductDetails(String productID) {

        DatabaseReference productRef = FirebaseDatabase.getInstance().getReference().child("Products");
        productRef.child(productID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               if(dataSnapshot.exists())
               {
                   Products products = dataSnapshot.getValue(Products.class);
                   productname.setText(products.getPname());
                   productprice.setText(products.getPrice());
                   productdescition.setText(products.getDescription());
                   Picasso.get().load(products.getImage()).into(productimage);
               }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}

