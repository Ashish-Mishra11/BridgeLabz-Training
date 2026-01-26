package com.day09.musicapp;

public class MusicAppDriver {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        
        library.add(new Song("TRK-102", "Shape ", "Ed Sheeran", 235));
        library.add(new Song("TRK-589", "Blinding ", "The Weeknd", 200));
        library.add(new Song("TRK-317", "Levitating", "Dua Lipa", 203));
        library.add(new Song("TRK-004", "Bad ", "Billie Eilish", 194));
        library.add(new Song("TRK-876", "As It ", "Harry Styles", 167));

        
        library.showByTrackId();
        System.out.println();

        
        library.showAlphabeticalPlaylist();
        System.out.println();

        
        String[] searches = {"TRK-317", "TRK-999"};
        
        for (String id : searches) {
            Song found = library.find(id);
            System.out.println("Search " + id + " → " + 
                              (found != null ? found : "Not found"));
        }
    }
}