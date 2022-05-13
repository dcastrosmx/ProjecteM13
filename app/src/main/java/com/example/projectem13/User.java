package com.example.projectem13;

public class User {
    private String nom;
    public User(){}
    public User(String nom){
        this.nom = nom;
    }

    public String getName(){
        return nom;
    }
    public void setName(String nom){
        this.nom = nom;
    }

}
