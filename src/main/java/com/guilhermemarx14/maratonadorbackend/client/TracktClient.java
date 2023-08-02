package com.guilhermemarx14.maratonadorbackend.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.guilhermemarx14.maratonadorbackend.model.trakt.TraktMovie;

@Component
@FeignClient(
        name = "trakt-api",
        url = "${application.trakt.baseUrl}",
        primary = false)
public interface TracktClient {
    @GetMapping("/movies/trending")
    List<TraktMovie> getTrendingMoviesList();
}
