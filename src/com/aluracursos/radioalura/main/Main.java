package com.aluracursos.radioalura.main;

import com.aluracursos.radioalura.models.Favorites;
import com.aluracursos.radioalura.models.Podcast;
import com.aluracursos.radioalura.models.Song;

import java.nio.file.attribute.PosixFileAttributes;

public class Main {
    public static void main(String[] args) {
        Song foreverSong = new Song();
        foreverSong.setTitle("Forever");
        foreverSong.setArtist("Kiss");

        Podcast cafeTech = new Podcast();
        cafeTech.setPresenter("Gabriela Aguilar");
        cafeTech.setTitle("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            foreverSong.like();
        }
        for (int i = 0; i < 5000; i++) {
            foreverSong.play();
        }
        for (int i = 0; i < 1000; i++) {
            cafeTech.like();
        }
        for (int i = 0; i < 15000; i++) {
            cafeTech.play();
        }

        System.out.printf("\nAudio: %s", foreverSong.getTitle());
        System.out.printf("\nTotal plays: %d", foreverSong.getTotalReproductions());
        System.out.printf("\nTotal likes: %d", foreverSong.getTotalLikes());

        Favorites favorites = new Favorites();
        favorites.addToMyFavorites(foreverSong);
        favorites.addToMyFavorites(cafeTech);
    }
}
