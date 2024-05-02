package com.aluracursos.radioalura.models;

public class Song extends Audio {
    private String album;
    private String artist;
    private String gender;

    @Override
    public int getClassification() {
        int rating = 0;
        if (getTotalLikes() > 5000) {
            rating = 8;
        } else {
            rating = 4;
        }
        return rating;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
