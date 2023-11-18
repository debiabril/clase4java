package org.example.states;

import org.example.Icon;
import org.example.Song;

public class Regular implements State{
    public Regular() {
    }

    public void toBooom(Song song) {
        if (song.getTotalViews() > 1000) {
            song.setState(new Boom());
            song.setIcon(Icon.ROCKET);
            String var10001 = song.getArtistName();
            song.setCaption(var10001 + "-" + song.getTitle() + "(" + song.getAlbumName() + "-" + song.getAlbumYear() + ")");
        } else {
            System.out.println("Requeriments aren't satisfaced");
        }

    }

    public void toRegular(Song song) {
        System.out.println("NOOO, you are right now in regular");
    }

    public void toTrend(Song song) {
        if (song.getTotalViews() > 50000 && song.getLikes() > 20000) {
            song.setState(new Trend());
            song.setIcon(Icon.FIRE);
            String var10001 = song.getTitle();
            song.setCaption(var10001 + " - " + song.getArtistName() + "(" + song.getAlbumName() + "-" + song.getAlbumYear() + ")");
        } else {
            System.out.println("Some requirements aren't satisfaced");
        }

    }
}
