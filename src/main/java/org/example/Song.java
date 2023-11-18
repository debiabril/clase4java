package org.example;

import org.example.states.Regular;
import org.example.states.State;
import java.io.PrintStream;
import java.util.Date;
public class Song {
    private String albumName;
    private String title;
    private String artistName;
    private String caption;
    private int albumYear;
    private int likes;
    private int dislikes;
    private int totalViews;
    private State state;
    private Icon icon;
    private Date lastView;

    public String getAlbumName() {
        return this.albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getAlbumYear() {
        return this.albumYear;
    }

    public void setAlbumYear(int albumYear) {
        this.albumYear = albumYear;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return this.dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getTotalViews() {
        return this.totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Date getLastView() {
        return this.lastView;
    }

    public void setLastView(Date lastView) {
        this.lastView = lastView;
    }

    public Song(String albumName, String title, String artistName, int albumYear, int likes, int dislikes, int totalViews, Date lastView) {
        this.albumName = albumName;
        this.title = title;
        this.artistName = artistName;
        this.albumYear = albumYear;
        this.likes = likes;
        this.dislikes = dislikes;
        this.totalViews = totalViews;
        this.lastView = lastView;
        this.state = new Regular();
        this.icon = Icon.MUSICAL_NOTE;
        this.caption = artistName + " - " + albumName + " - " + title;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void toBoom() {
        this.state.toBooom(this);
    }

    public void toRegular() {
        this.state.toRegular(this);
    }

    public void toTrend() {
        this.state.toTrend(this);
    }

    public void show() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.getIcon());
        var10000.println(var10001 + this.getCaption() + "\n");
    }
}
