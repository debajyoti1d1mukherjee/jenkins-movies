package com.redhat.movies;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie implements Serializable {

    private static final long serialVersionUID = -3240337073623122124L;

    @JsonProperty
    private Integer movieId;
    @JsonProperty
    private String name;
    @JsonProperty
    private String genre;

    public Movie(Integer movieId, String name, String genre) {
        this.movieId = movieId;
        this.name = name;
        this.genre = genre;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}