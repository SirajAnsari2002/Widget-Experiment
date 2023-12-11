package com.example.widgetexperiment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int itemId = item.getItemId();
        if(itemId == R.id.action_home){
            Toast.makeText(MainActivity.this,
                    "YOU CLICKED ON HOME",
                    Toast.LENGTH_LONG).show();
        }
        else if(itemId == R.id.action_search){
            Toast.makeText(MainActivity.this,
                    "YOU CLICKED ON SEARCH",
                    Toast.LENGTH_LONG).show();
        }
        return onOptionsItemSelected(item);
    }

}