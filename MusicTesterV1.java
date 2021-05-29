import java.util.*;
/**
 * Learn Sequential Search
 * 3-14-2021
 * Ryan Wagner
 */
public class MusicTesterV1
{
    public static void main(String[] args){
        Music[] songs = new Music[10];
        songs[0] = new Music("Livin' on a Prayer", 1986, "Bon Jovi");
        songs[1] = new Music("Sweet Caroline", 1969, "Neil Diamond");
        songs[2] = new Music("One", 1988, "Metallica");
        songs[3] = new Music("All Star", 1999, "Smath Mouth");
        songs[4] = new Music("Bohemian Rhapsody", 1975, "Queen");
        songs[5] = new Music("Satellite", 1993, "Dave Matthews Band");
        songs[6] = new Music("Under Pressure", 1995, "Queen");
        songs[7] = new Music("Dream On", 1973, "Areosmith");
        songs[8] = new Music("I Want It That Way", 1999, "Backstreet Boys");
        songs[9] = new Music("Free Fallin'", 1989, "Tom Petty");
        
        System.out.println("Original List: \n");
        printSongs(songs);
        
        //findByTitle(songs, "All Star");
        findByTitle(songs, "Master of Puppets");
        
        findByYear(songs, 1999);
        //findByYear(songs, 2000);
        
        findByArtist(songs, "Queen");
        //findByArtist(songs, "Elvis Presly");
    }
    
    public static void printSongs(Music[] songs){
        System.out.printf("%s %24s %8s \n\n", "Title", "Year", "Artist");
        for(Music m: songs){
            System.out.println(m);
        }
    }
    
    public static void findByTitle(Music[] songs, String song){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int i = 0; 
        boolean found = false;
        while(!found && i < songs.length){
            if(songs[i].getTitle().equals(song)){
                indexes.add(i);
            }
            i++;
            if(i == songs.length && indexes.size() == 0){
                System.out.println("\n" + song + " was not found.\n");
            }
        }
        for(Integer I: indexes){
            System.out.println("\n" + song + " was found at index " + I + ".\n");
            System.out.println(songs[I] + "\n");
        }
    }
    
    public static void findByYear(Music[] songs, int year){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int i = 0;
        boolean found = false;
        while(!found && i < songs.length){
            if(songs[i].getYear() == year){
                indexes.add(i);
            }
            i++;
            if(i == songs.length && indexes.size() == 0){
                System.out.println("\nYear " + year + " was not found.\n");
            }
        }
        for(Integer I: indexes){
            System.out.println("\nYear " + year + " was found at index " + I + ".\n");
            System.out.println(songs[I] + "\n");
        }
    }   
    
    public static void findByArtist(Music[] songs, String artist){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int i = 0; 
        boolean found = false;
        while(!found && i < songs.length){
            if(songs[i].getArtist().equals(artist)){
                indexes.add(i);
            }
            i++;
            if(i == songs.length && indexes.size() == 0){
                System.out.println("\nArtist " + artist + " was not found.\n");
            }
        }
        for(Integer I: indexes){
            System.out.println("\nArtist " + artist + " was found at index " + I + ".\n");
            System.out.println(songs[I] + "\n");
        }
    }
}
