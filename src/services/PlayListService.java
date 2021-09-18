package services;

import model.Music;

public interface PlayListService {
    void addMusic(Music music);
    int getNumberOfMusic();
    Music findMusicByTitle(String title);
    void deleteMusicByTitle(String title);
}
