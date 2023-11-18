package org.example.states;

import org.example.Song;

public interface State {
    void toBooom(Song song);

    void toRegular(Song song);

    void toTrend(Song song);
}
