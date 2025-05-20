package dev.caio.filmes.repository;


import dev.caio.filmes.entity.ReviewEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewEntity, ObjectId> {
}
