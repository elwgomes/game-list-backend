package com.elwgomes.dslist.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.elwgomes.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;
    
    public GameListDTO () {
        
    }
    
    public GameListDTO (GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GameListDTO other = (GameListDTO) obj;
        return Objects.equals(id, other.id);
    }
    
    
}
