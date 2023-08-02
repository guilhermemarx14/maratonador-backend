package com.guilhermemarx14.maratonadorbackend.model.tmdb;

import java.util.List;

public record TmdbMovieList(Integer page, List<TmdbMovieList.TmdbMovie> results, Integer total_pages,
        Integer total_results) {

    public record TmdbMovie(
            boolean adult,
            String backdrop_path,
            String belongs_to_collection,
            Integer budget,
            List<TmdbGenre> genres,
            String homepage,
            Integer id,
            String imdb_id,
            String original_language,
            String original_title,
            String overview,
            Double popularity,
            String poster_path,
            List<TmdbProductionCompany> production_companies,
            List<TmdbProductionCountry> production_countries,
            String release_date,
            Integer revenue,
            Integer runtime,
            List<SpokenLanguage> spoken_languages,
            String status,
            String tagline,
            String title,
            boolean video,
            Double vote_average,
            Integer vote_count) {

    }

    public record TmdbGenre(
            Integer id,
            String name) {}

    public record TmdbProductionCompany(
            Integer id,
            String logo_path,
            String name,
            String origin_country) {}

    public record TmdbProductionCountry(
            String iso_3166_1,
            String name) {}

    public record SpokenLanguage(
            String english_name,
            String iso_639_1,
            String name) {}
}
