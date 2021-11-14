package com.raunaksinghinventor.linked_list.linked_list_challenge_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) == null) {
            songs.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        ListIterator<Song> i = songs.listIterator();
        while (i.hasNext()) {
            if (i.next().getTitle() == songTitle) {
                return i.previous();
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> songs) {
        if (trackNumber - 1 < this.songs.size() && trackNumber > 0) {
            songs.add(this.songs.get(trackNumber - 1));
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> songs) {
        Song song = findSong(songTitle);
        if (song != null) {
            songs.add(song);
            return true;
        }
        return false;
    }
}
