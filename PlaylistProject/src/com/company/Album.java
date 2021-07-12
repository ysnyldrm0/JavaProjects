package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
            System.out.println("song succesfully added");
            return true;
        }
        System.out.println("song exist");
        return false;
    }

    private Song findSong(String title){
        ListIterator<Song> listIterator = songs.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next().getTitle().equalsIgnoreCase(title))
                return listIterator.previous();
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList linkedList){
            if(songs.size() >= trackNumber && trackNumber > 0){
                linkedList.add(songs.get(trackNumber-1));
                System.out.println("added to playlist");
                return true;
            }
        System.out.println("does not exist");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList linkedList){
        ListIterator<Song> listIterator = songs.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next().getTitle().equalsIgnoreCase(title)){
                linkedList.add(listIterator.previous());
                System.out.println("added to playlist");
                return true;
            }
        }
        System.out.println("does not exist");
        return false;
    }


}
