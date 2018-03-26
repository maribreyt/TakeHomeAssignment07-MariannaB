package com.example.android.takehomeassignment07_mariannab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by maribreyt on 3/25/18.
 */

public class LessonAdapter extends RecyclerView.Adapter<LessonViewHolder>  {
    private List<Lessons> lessons;
    private Context context;

    public LessonAdapter(List<Lessons> lessons, Context context) {
        this.lessons = lessons;
        this.context = context;
    }

    @Override
    public LessonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_lessons, parent, false);
        return new LessonViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(LessonViewHolder holder, int position) {
        Lessons newLesson = lessons.get(position);
        holder.getLessonNameView().setText(newLesson.getName());
        holder.getLessonDurationView().setText(newLesson.getDuration());
        holder.getLessonImageView().setImageResource(newLesson.getImage());
    }

    @Override
    public int getItemCount() {
        return lessons.size();
    }

}
