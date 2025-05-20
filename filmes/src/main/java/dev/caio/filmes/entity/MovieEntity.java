package dev.caio.filmes.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
public class MovieEntity {

    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String relaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference
    private List<ReviewEntity> reviewIds;

    public MovieEntity() {

    }

    public MovieEntity(ObjectId id, String imdbId, String title,
                       String relaseDate, String trailerLink, String poster,
                       List<String> genres, List<String> backdrops, List<ReviewEntity> reviewIds) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.relaseDate = relaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrops = backdrops;
        this.reviewIds = reviewIds;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(List<String> backdrops) {
        this.backdrops = backdrops;
    }

    public List<ReviewEntity> getReviewIds() {
        return reviewIds;
    }

    public void setReviewIds(List<ReviewEntity> reviewIds) {
        this.reviewIds = reviewIds;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id=" + id +
                ", imdbId='" + imdbId + '\'' +
                ", title='" + title + '\'' +
                ", relaseDate='" + relaseDate + '\'' +
                ", trailerLink='" + trailerLink + '\'' +
                ", poster='" + poster + '\'' +
                ", genres=" + genres +
                ", backdrops=" + backdrops +
                ", reviewIds=" + reviewIds +
                '}';
    }
}
