package com.example.android.takehomeassignment07_mariannab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public void rewards(MenuItem item) {
        Toast.makeText(this, "Rewards are coming!", Toast.LENGTH_SHORT).show();
    }

    public void shareIt(MenuItem item) {
        Toast.makeText(this, "Create an account to share", Toast.LENGTH_SHORT).show();
    }

    public void startLessons(MenuItem item) {
        Toast.makeText(this, "Let's do it!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}
