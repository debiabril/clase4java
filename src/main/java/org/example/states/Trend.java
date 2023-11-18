package org.example.states;

import org.example.Icon;
import org.example.Song;

import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Trend implements State{
    public Trend() {
    }

    public void toBooom(Song song) {
        System.out.println("NOPE");
    }

    public void toRegular(Song song) {
        Date actualDate = new Date();
        if (TimeUnit.MILLISECONDS.toHours(actualDate.getTime()) - TimeUnit.MILLISECONDS.toHours(song.getLastView().getTime()) > 23L) {
            song.setState(new Regular());
            song.setIcon(Icon.MUSICAL_NOTE);
            String var10001 = song.getArtistName();
            song.setCaption(var10001 + " - " + song.getAlbumName() + " - " + song.getTitle());
        }

    }

    public void toTrend(Song song) {
        System.out.println("NOPE");
    }
}
