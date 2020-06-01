package com.lbap.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context mContext;
    private List<Movie> movieList;

    public MovieAdapter(@NonNull Context context, @NonNull List<Movie> movies) {
        super(context, 0, movies);

        mContext = context;
        movieList = movies;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item_each_row, parent, false);

        Movie currentMovie = movieList.get(position);

        TextView name = (TextView) listItem.findViewById(R.id.tvMovieName);
        name.setText(currentMovie.getName());

        TextView releaseDate = (TextView) listItem.findViewById(R.id.tvMovieReleaseDate);
        releaseDate.setText(currentMovie.getReleaseDate());

        return listItem;

    }
}
