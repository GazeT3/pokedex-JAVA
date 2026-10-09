package com.gazete.pokedex.model;

import java.util.List;

public class PokemonModel {
    private int number;
    private String name;
    private List<String> types;

    public PokemonModel(){
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public List<String> getTypes(){
        return types;
    }
    public void setTypes(List<String> types){
        this.types=types;
    }
}
