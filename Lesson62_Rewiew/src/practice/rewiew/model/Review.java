package practice.rewiew.model;


import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class Review implements Comparable<Review>{
    private String comment;
    private long id;
    private int rating;
    private final String author;
    private String product;
    private int likes;
   private LocalDateTime date;

    public Review(String comment, long id, int rating, String author, String product, int likes, LocalDateTime date) {
        this.comment = comment;
        this.id = id;
        this.rating = rating;
        this.author = author;
        this.product = product;
        this.likes = likes;
        this.date = date;
    }

    public Review(int rating, String comment, String author, String product, int likes) {
        this.rating = rating;
        this.comment = comment;
        this.author = author;
        this.product = product;
        this.likes = likes;
    }

    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getAuthor() {
        return author;
    }

    public String getProduct() {
        return product;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Review{" +
                "comment='" + comment + '\'' +
                ", rating=" + rating +
                ", likes" + likes +
                ", author='" + author + '\'' +
                ", product='" + product + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int addLike(){
        return likes++;
    }

    @Override
    public int compareTo(Review o) {
        return this.date.compareTo(o.date);
    }

    public int compareToRating(Review o) {
        return this.rating-(o.rating);
    }
}
