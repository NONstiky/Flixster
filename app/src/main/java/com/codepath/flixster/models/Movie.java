package com.codepath.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by mbanchik on 6/21/17.
 */

@Parcel // annotation indicates class is Parcelable
public class Movie {

    // values from API
    // removed private declarations on all members to make class parcelable
    String title;
    String overview;
    String posterPath; // only the path
    String backdropPath;
    Double voteAverage;
    Integer id;

    // default constructor for Parceler
    public Movie(){}

    // initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
        id = object.getInt("id");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {

        return backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public Integer getId() {
        return id;
    }
}
