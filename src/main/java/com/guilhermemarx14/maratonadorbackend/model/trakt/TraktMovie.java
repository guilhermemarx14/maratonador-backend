package com.guilhermemarx14.maratonadorbackend.model.trakt;

public record TraktMovie(
        Integer watchers,
        TraktMovie.TracktMovieInformation movie) {

    public record TracktMovieInformation(
            String title,
            Integer year,
            TracktIds ids) {}

    public record TracktIds(
            Integer trakt,
            String slug,
            String imdb,
            Integer tmdb) {}
}
