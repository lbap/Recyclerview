package com.lbap.recyclerview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<Movie> movies = new ArrayList<>();

        Movie movie = new Movie(1, "Spider-Man: Home Coming", "12-01-2016");
        movies.add(movie);

        movie = new Movie(2, "Iron Man", "12-01-2009");
        movies.add(movie);

        movie = new Movie(3, "Deadpool", "12-01-2009");
        movies.add(movie);

        movie = new Movie(4, "Captain America", "12-01-2009");
        movies.add(movie);

        movie = new Movie(5, "Black Widow", "12-01-2009");
        movies.add(movie);

        movie = new Movie(5, "Black Widow", "12-01-2009");
        movies.add(movie);

        movie = new Movie(6, "Hulk", "12-01-2009");
        movies.add(movie);

        movie = new Movie(6, "Wolverine", "12-01-2009");
        movies.add(movie);

        MovieAdapter adapter = new MovieAdapter(this, movies);
        listView.setAdapter(adapter);
    }

}
