package com.guilhermemarx14.maratonadorbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermemarx14.maratonadorbackend.client.TmdbClient;
import com.guilhermemarx14.maratonadorbackend.model.tmdb.TmdbMovieList;

@RestController
@RequestMapping(path = "/")
public class TestController {

    @Autowired
    TmdbClient tmdbClient;

    @GetMapping("test")
    public ResponseEntity<TmdbMovieList> test() {

        return ResponseEntity.ok(tmdbClient.getPopularMoviesList(1L, false, "en-US", 2020));
    }
}
