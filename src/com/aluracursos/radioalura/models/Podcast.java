package com.aluracursos.radioalura.models;

public class Podcast extends Audio {
    private String presenter;
    private String description;

    @Override
    public int getClassification() {
        int rating = 0;

        if (getTotalReproductions() >= 2000) {
            rating = 9;
        } else {
            rating = 5;
        }

        return rating;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
