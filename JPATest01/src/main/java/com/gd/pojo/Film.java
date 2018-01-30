package com.gd.pojo;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Year;
import java.util.Date;

/**
 * Created by 郭 on 2018/1/28.
 */
@Entity
@Table(name = "film")
public class Film implements Serializable {
    public Film() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer film_id;
    @Column
    @Value("abcgfgfgf")
    private String title;
    @Column()
    private String description;
    @Column()
    @Value("2018")
    private Year release_year;
    @Column(nullable = false)
    private Integer language_id;
    @Column(nullable = false)
    private Integer original_language_id;
    @Column(nullable = false)
    private Integer rental_duration;
    @Column(nullable = false)
    private String rental_rate;
    @Column()
    private Integer length;
    @Column(nullable = false)
    private String replacement_cost;
    @Column()
    @Value("G")
    private String rating;
    @Column(nullable = false)
    @Value("Trailers")
    private String special_features;
    @Column()
    private Date last_update;

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Year getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Year release_year) {
        this.release_year = release_year;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Integer getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Integer getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public String getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(String rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(String replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

}
