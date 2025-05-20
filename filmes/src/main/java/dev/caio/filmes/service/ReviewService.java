package dev.caio.filmes.service;

import dev.caio.filmes.entity.MovieEntity;
import dev.caio.filmes.entity.ReviewEntity;
import dev.caio.filmes.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public ReviewEntity createReview(String reviewBody, String imdbId) {
        ReviewEntity review = repository.insert(new ReviewEntity(reviewBody));

        mongoTemplate.update(MovieEntity.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review.getId()))
                .first();
        return review;
    }
}
