package services;

import model.Music;
import repo.PlayListDB;

public class PlayListServiceImpl implements PlayListService {

    private PlayListDB playListDB;

    public PlayListServiceImpl() {
        playListDB = new PlayListDB();
    }

    @Override
    public void addMusic(Music music) {
        playListDB.add(music);
    }

    public int getNumberOfMusic() {
        return playListDB.size();
    }

    @Override
    public Music findMusicByTitle(String title) {
        return playListDB.findMusicByTitle(title);
    }

    @Override
    public void deleteMusicByTitle(String title) {
        playListDB.remove(title);
    }
}
