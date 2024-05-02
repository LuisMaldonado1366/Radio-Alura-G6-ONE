package com.aluracursos.radioalura.models;

public class Favorites {

    public void addToMyFavorites(Audio audio) {
        if (audio.getClassification() >= 8) {
            System.out.printf("\n\nThe song %s is one of the top trending topics!", audio.getTitle());
        } else {
            System.out.printf("\n\nThe song %s is one the favorites.", audio.getTitle());
        }
    }
}
