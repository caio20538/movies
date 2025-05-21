package dev.caio.filmes.controller;

import dev.caio.filmes.entity.ReviewEntity;
import dev.caio.filmes.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<ReviewEntity> createReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<ReviewEntity>(reviewService.createReview(payload.get("reviewBody"),
                payload.get("imdbId")), HttpStatus.CREATED);
    }
}
