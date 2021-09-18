package repo;

import model.Music;

import java.util.HashMap;
import java.util.Map;

public class PlayListDB {

    private Map<Music, Integer> database= new HashMap<>();

    public void add(Music music) {
        database.put(music, music.getMusicId());
    }

    public int size() {
        return database.size();
    }

    public Music findMusicByTitle(String title) {
        Music foundMusic = null;
       for(Map.Entry<Music, Integer> entry : database.entrySet()) {
           if(entry.getKey().getMusicTitle().equals(title)){
               foundMusic= entry.getKey();
           }
       }
       return foundMusic;
    }

    public void remove(String title) {
        Music found = findMusicByTitle(title);
        database.remove(found);
    }
}
