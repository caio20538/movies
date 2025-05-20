package dev.caio.filmes.service;

import dev.caio.filmes.entity.MovieEntity;
import dev.caio.filmes.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieEntity> AllMovies(){
        return movieRepository.findAll();
    }

    public Optional<MovieEntity> movie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
