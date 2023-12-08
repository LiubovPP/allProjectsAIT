package practice.rewiew.dao;

import practice.rewiew.model.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RatingsImpl implements Ratings {

    Collection<Review> reviews;

    public RatingsImpl(){
        reviews=new HashSet<>();
    }

    @Override
    public boolean add(Review review) {
//        for (int i = 0; i < ; i++) {
//        if(review.getAuthor().equalsIgnoreCase(review.getAuthor()) & review.getProduct().equalsIgnoreCase(review.getProduct())) {
//            return false;
//
//        }
//        }
        return review!=null && reviews.add(review);
    }

    @Override
    public boolean remove(Long id) {
        Review removed=findById(id);
        if(removed !=null){
            reviews.remove(removed);
            return true;
        }
        return false;
    }
    public Review findById(Long id){
        for(Review p:reviews){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean update(Long id, int newRating) {
        Review review = findById(id);
        if (review == null) {
            return false;
        }
        review.setRating(newRating);
        return true;
    }

    @Override
    public Iterable<Review> getReviewsByProduct(String product) {
        return reviews.stream().filter(p->p.getProduct().equalsIgnoreCase(product)).collect(Collectors.toList());
    }

    @Override
    public Iterable<Review> getReviewsByAuthor(String author) {
        return reviews.stream().filter(p->p.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
    }

    @Override
    public double getAvgRatingByProduct(String product) {
        return reviews.stream()
                .mapToDouble(p -> p.getRating()).average().orElse(0.0);
                //.count();
       // return counter/reviews.size();
    }

    @Override
    public Iterable<Review> getReviewsWithMaxLikes() {
        int maxLike = reviews.stream()
                .mapToInt(Review::addLike)
                .max()
                .orElse(0);
        return reviews.stream()
                .filter(c -> c.addLike()>=maxLike)
                .collect(Collectors.toList());

    }
    public static double calculateProductRating(List<Review> reviews, String product) {
    List<Review> productReviews = new ArrayList<>();
    for (Review review : reviews) {
        if (review.getProduct().equalsIgnoreCase(product)) {
            productReviews.add(review);
        }
    }
    if (productReviews.isEmpty()) {
        return 0; // Нет отзывов о продукте
    }
    double totalRating = 0;
    for (Review review : productReviews) {
        totalRating += review.getRating();
    }
    return totalRating / productReviews.size();
}

    }