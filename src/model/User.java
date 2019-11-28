package model;

import java.util.*;

public class User {

    private String name;
    private ArrayList<Media> favourites;

    public User(String name) {
        this.name = name;
        favourites = new ArrayList<>();
    }

    public ArrayList<Media> getFavourites() {
        return favourites;
    }

    // Tilføjer ny film/serie til favoritlisten
    public void addFavourite(Media media) {

    }

    // Fjerner film/serie fra favoritlisten
    public void removeFavourite(Media media) {

    }

}

