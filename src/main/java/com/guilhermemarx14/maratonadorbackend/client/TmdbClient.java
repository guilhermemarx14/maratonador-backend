package com.guilhermemarx14.maratonadorbackend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.guilhermemarx14.maratonadorbackend.model.tmdb.TmdbMovieList;

@Component
@FeignClient(
        name = "tmdb-api",
        url = "${application.tmdb.baseUrl}",
        primary = false)
public interface TmdbClient {

    @GetMapping("/movie/popular")
    TmdbMovieList getPopularMoviesList(@RequestParam Long page, @RequestParam boolean include_adult,
            @RequestParam String language,
            @RequestParam Integer year);

}
