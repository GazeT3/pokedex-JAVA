package com.gazete.pokedex.model;

public class CapturedPokemonModel {
    private int id;
    private int number;
    private String name;
    private String nickname;

    public CapturedPokemonModel(){
    }

    public CapturedPokemonModel(int number, String name, String nickname){
        this.number=number;
        this.name=name;
        this.nickname=nickname;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
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

    public String getNickname(){
        return nickname;
    }
    public void SetNickname(String nickname){
        this.nickname=nickname;
    }
}
