package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.example.test.MainRec;
import com.example.test.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

        public DrawerLayout drawerLayout;
        public ActionBarDrawerToggle actionBarDrawerToggle;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            drawerLayout = findViewById(R.id.my_drawer_layout);
            actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);


            drawerLayout.addDrawerListener(actionBarDrawerToggle);
            actionBarDrawerToggle.syncState();



            // to make the Navigation drawer icon always appear on the action bar
            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

            Snackbar.make(findViewById(R.id.my_drawer_layout),R.string.email,Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  Toast.makeText(getApplicationContext(),"action done",Toast.LENGTH_LONG).show();
                }
            }).show();


        }

        // override the onOptionsItemSelected() function to implement the item click listener callback to open and close the navigation drawer when the icon is clicked
        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {

            if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }

        public void next(View view){
            Intent intent = new Intent(this, MainRec.class);
            startActivity(intent);




        }

        public void camera(View view){
              Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
              startActivity(intent);
//            if() {
//
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivity(intent);
//            }
//            else{
//                Toast.makeText(getApplicationContext(),"Permission denied",Toast.LENGTH_LONG).show();
//            }

    }
    }
