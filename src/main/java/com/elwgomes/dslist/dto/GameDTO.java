package com.elwgomes.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.elwgomes.dslist.entities.Game;

public class GameDTO {

    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;    
    private String longDescription;

    public GameDTO (Game entity) {
//        copia todos os atributos da classe Game e coloca em "entity" porém precisa getters e setters (não apenas getters como é normal em um DTO)
        BeanUtils.copyProperties(entity, this);
//        id = entity.getId();
//        title = entity.getTitle();
//        year = entity.getYear();
//        genre = entity.getGenre();
//        platforms = entity.getPlatforms();
//        score = entity.getScore();
//        imgUrl = entity.getImgUrl();
//        shortDescription = entity.getShortDescription();
//        longDescription = entity.getLongDescription();
    }
    
    public GameDTO () {}

    public GameDTO(Long id, String title, int year, String genre, String platforms, Double score, String imgUrl,
            String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    
}
