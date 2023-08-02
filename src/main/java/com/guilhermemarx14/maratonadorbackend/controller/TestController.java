package com.guilhermemarx14.maratonadorbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermemarx14.maratonadorbackend.client.TmdbClient;
import com.guilhermemarx14.maratonadorbackend.client.TracktClient;
import com.guilhermemarx14.maratonadorbackend.model.trakt.TraktMovie;

@RestController
@RequestMapping(path = "/")
public class TestController {

    @Autowired
    TmdbClient tmdbClient;

    @Autowired
    TracktClient tracktClient;

    @GetMapping("test")
    public ResponseEntity<List<TraktMovie>> test(/* @RequestParam final Long movieId */) {
        // final var popular = tmdbClient.getPopularMoviesList(1l, false, "en-US", 2023);
        //
        return ResponseEntity.ok(tracktClient.getTrendingMoviesList());
    }

}
