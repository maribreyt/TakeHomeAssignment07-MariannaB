package com.example.android.takehomeassignment07_mariannab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<Lessons> lessons;
    LessonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        Intent intent = getIntent();
        initialData(); //notice we call the method in onCreate. why here?
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new LessonAdapter(lessons, this);
        recyclerView.setAdapter(adapter);

    }
    private void initialData() {
        lessons = new ArrayList<>();
        lessons.add(new Lessons("Table", "15 min", R.drawable.table));
        lessons.add(new Lessons("Snake Crawl", "15 min", R.drawable.shakecrawl));
        lessons.add(new Lessons("Crab Walk", "15 min", R.drawable.crabwalk));
    }

    private Lessons getRandomLesson() {
        int num = (int) (Math.random() * 3);
        if (num == 0)

            return new Lessons("Table", "15 min", R.drawable.table);
        if (num == 1)

            return new Lessons("Snake Crawl", "15 min", R.drawable.shakecrawl);
        else
            adapter.notifyDataSetChanged();
        return new Lessons("Crab Walk", "15 min", R.drawable.crabwalk);

    }


    public void addRandomLesson(View view) {
        lessons.add(getRandomLesson());
        adapter.notifyDataSetChanged();
    }
}
