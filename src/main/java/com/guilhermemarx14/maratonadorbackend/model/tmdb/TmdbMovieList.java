package com.guilhermemarx14.maratonadorbackend.model.tmdb;

import java.util.List;

public record TmdbMovieList(Integer page, List<TmdbMovie> results, Integer total_pages, Integer total_results) {

}
