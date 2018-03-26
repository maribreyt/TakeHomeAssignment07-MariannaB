package com.example.android.takehomeassignment07_mariannab;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by maribreyt on 3/25/18.
 */

public class LessonViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView lessonNameView;
    public TextView lessonDurationView;
    public ImageView lessonImageView;
    public Context context;

    public TextView getLessonNameView() {
        return lessonNameView;
    }

    public TextView getLessonDurationView() {
        return lessonDurationView;
    }

    public ImageView getLessonImageView() {
        return lessonImageView;
    }
    public LessonViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        lessonNameView = (TextView) itemView.findViewById(R.id.lesson_name);
        lessonDurationView = (TextView) itemView.findViewById(R.id.lesson_duration);
        lessonImageView = (ImageView) itemView.findViewById(R.id.lesson_image);
        this.context = context;

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, lessonNameView.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
