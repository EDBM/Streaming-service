package model;

public class MediaNotFoundException extends Exception {
    public MediaNotFoundException() {
        super("No media with that title!");
    }
}
