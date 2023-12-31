package com.example.menuactivity1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.menuExit){
            finish();
        }

        else if (item.getItemId()==R.id.menuOption){
            Snackbar.make(getWindow().getDecorView().getRootView(),"Option",Snackbar.LENGTH_LONG).show();

            }else if (item.getItemId()==R.id.menuSearch){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://www.google.com"));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}