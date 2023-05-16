package com.elwgomes.dslist.dto;


import org.springframework.beans.BeanUtils;

import com.elwgomes.dslist.entities.Game;
import com.elwgomes.dslist.projections.GameMinProjection;

public class GameMinDTO {

    private Long id;    
    private String title;
    private int year;
    private String imgUrl;
    private String shortscription;
    
    public GameMinDTO (Game entity) {
        BeanUtils.copyProperties(entity, this);
//        id = entity.getId();
//        title = entity.getTitle();
//        year = entity.getYear();
//        imgUrl = entity.getImgUrl();
//        shortscription = entity.getShortDescription();
    }
    
    public GameMinDTO (GameMinProjection projection) {
        BeanUtils.copyProperties(projection, this);
//        id = projection.getId();
//        title = projection.getTitle();
//        year = projection.getYear();
//        imgUrl = projection.getImgUrl();
//        shortscription = projection.getShortDescription();
    }
    
    
    public GameMinDTO () {
        
    }
    
    public GameMinDTO(Long id, String title, int year, String imgUrl, String shortscription) {
        super();
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortscription = shortscription;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setShortscription(String shortscription) {
        this.shortscription = shortscription;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortscription() {
        return shortscription;
    }
    
    
    
}
