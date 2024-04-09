package no.hiof.oleedvao.lecture22;

import no.hiof.oleedvao.lecture22.models.Album;
import no.hiof.oleedvao.lecture22.interfaces.PrintCondition;
import no.hiof.oleedvao.lecture22.interfaces.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("In Rainbows", "Radiohead", 2007));
        albums.add(new Album("Souvlaki", "Slowdive", 1994));
        albums.add(new Album("SILENT HILL2", "Akira Yamaoka", 2001));
        albums.add(new Album("Pet Sounds", "The Beach Boys", 1966));
        albums.add(new Album("98.12.28", "Fishmans", 1999));
        albums.add(new Album("Blue Rev", "Alvvays", 2022));
        albums.add(new Album("Mercurial World", "Magdalena Bay", 2021));
        albums.add(new Album("The Mollusk", "Ween", 1997));
        albums.add(new Album("In The Court Of The Crimson King", "King Crimson", 1969));
        albums.add(new Album("Knocknarea", "Maruja", 2023));
        albums.add(new Album("The Downward Spiral", "Nine Inch Nails", 1994));
        albums.add(new Album("Emotion", "Carly Rae Jepsen", 2015));
        albums.add(new Album("You Will Never Know Why", "Sweet Trip", 2009));
        albums.add(new Album("Violator", "Depeche Mode", 1990));
        albums.add(new Album("Ants From Up There", "Black Country, New Road", 2022));

        System.out.println("-----------Unsorted Albums-----------");
        printAlbums(albums);

        System.out.println();
        System.out.println("-----------Standard, name sorted albums----------");
        Collections.sort(albums);
        printAlbums(albums);

        System.out.println();
        System.out.println("------------Albums sorted by year, ASC-----------");
        Collections.sort(albums, new Comparator<Album>() {
            @Override
            public int compare (Album album1, Album album2){
                return Integer.compare(album1.getYear(), album2.getYear());
            }
            
        });
        printAlbums(albums);

        
        System.out.println();
        System.out.println("------------Albums sorted by year, ASC with lambda-----------");
        Collections.sort(albums, (album1, album2) -> {
                return Integer.compare(album1.getYear(), album2.getYear());
            }
        );

        System.out.println();
        System.out.println("------Albums starting with T-----");
        printAlbumsConditionally(albums, new PrintCondition() {
            @Override
            public boolean met(Album album) {
                return album.getTitle().startsWith("T");
            }
        });

        System.out.println();
        System.out.println("------Albums starting with T, with lambda-----");
        printAlbumsConditionally(albums, album -> album.getTitle().startsWith("T"));

        System.out.println();
        System.out.println("------Albums after the year 2000, with lambda-----");
        printAlbumsConditionally(albums, album -> album.getYear() > 2000);

        System.out.println();
        System.out.println("-----Print old albums-----");
        doWithAlbumsConditionally(albums, album -> album.getYear() < 1970, album -> System.out.println(album.getTitle() + " is old but gold!"));

        System.out.println();
        System.out.println("----Print all albums---");
        doWithAlbumsConditionally(albums, album -> true, album -> System.out.println(album));
    }

    public static void printAlbumsConditionally(ArrayList<Album> albums, PrintCondition printCondition) {
        for (Album albumX : albums) {
            if (printCondition.met(albumX)) {
                System.out.println(albumX);
            }
        }
    }
    public static void doWithAlbumsConditionally(ArrayList<Album> albums, PrintCondition printCondition, Action action) {
        for (Album albumX : albums) {
            if (printCondition.met(albumX)) {
                action.perform(albumX);
            }
        }
    }
    public static void printAlbums(ArrayList<Album> albums) {
        for (Album album : albums) {
            System.out.println(album);
        }
    }
}
