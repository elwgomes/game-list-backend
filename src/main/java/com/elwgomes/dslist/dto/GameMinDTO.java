package com.elwgomes.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.elwgomes.dslist.entities.Game;

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
