package dev.caio.filmes.repository;

import dev.caio.filmes.entity.MovieEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<MovieEntity, ObjectId> {
    Optional<MovieEntity> findMovieByImdbId(String imdbId);
}
