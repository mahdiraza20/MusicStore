package m_mehdi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    Scanner scanner = new Scanner(System.in);
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
    private Information information;
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
        information = new Information();


    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        int size = files.size();
        System.out.println(size);
        return size;

    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
       String listFile = files.get(index);
        System.out.println(listFile);

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        int counter = 1;
        for (String file : files) {
            System.out.println(counter + ":" +file);
            counter ++;
        }

    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.removeIf(note -> note.contains(files.get(index)));
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index));

    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();

    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if (index > files.size() || index < 0) {
            System.out.println("index not valid");
            return false;
        } else return true;


    }


    public void Search(String filename) {
        for (int i = 0;i < files.size();i ++) {
            if (files.get(i).contains(filename)) {
                System.out.println(files.get(i));
                break;
            }
        }
    }



}