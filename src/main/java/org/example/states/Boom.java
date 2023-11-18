package org.example.states;

import org.example.Icon;
import org.example.Song;

public class Boom implements State {
    public Boom() {
    }

    public void toBooom(Song song) {
        System.out.println("NOPE");
    }

    public void toRegular(Song song) {
        if (song.getDislikes() > 4999) {
            song.setState(new Regular());
            song.setIcon(Icon.MUSICAL_NOTE);
            String var10001 = song.getArtistName();
            song.setCaption(var10001 + " - " + song.getAlbumName() + " - " + song.getTitle());
        }

    }

    public void toTrend(Song song) {
        if (song.getTotalViews() > 50000 && song.getLikes() > 20000) {
            song.setState(new Trend());
            song.setIcon(Icon.FIRE);
            String var10001 = song.getTitle();
            song.setCaption(var10001 + " - " + song.getArtistName() + "(" + song.getAlbumName() + "-" + song.getAlbumYear() + ")");
        }

    }
}
