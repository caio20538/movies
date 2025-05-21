package dev.caio.filmes.controller;

import dev.caio.filmes.entity.MovieEntity;
import dev.caio.filmes.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/movies")
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<MovieEntity>> getAllMovies(){
        return new ResponseEntity<List<MovieEntity>>(movieService.AllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<MovieEntity>> getMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<MovieEntity>>(movieService.movie(imdbId), HttpStatus.OK);
    }
}
