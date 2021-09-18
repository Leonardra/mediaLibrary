import model.Music;
import services.PlayListServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PlayListTest {
    private PlayListServiceImpl playListServiceImpl;
    private Music firstMusic;

    @BeforeEach
    void setUp() {
        playListServiceImpl = new PlayListServiceImpl();
        firstMusic = new Music("The cavemen");
    }

    @Test
    void thatMusicCanBeAddedToPlaylist(){
        playListServiceImpl.addMusic(firstMusic);
        assertEquals(1, playListServiceImpl.getNumberOfMusic());
    }

    @Test
    void thatMusicCanBeFoundInPlayList(){
        playListServiceImpl.addMusic(firstMusic);
        Music found = playListServiceImpl.findMusicByTitle("The cavemen");
        assertNotNull(found);
        assertEquals(found, firstMusic);
    }

    @Test
    void thatMusicCanBeDeletedFromPlayList(){
        playListServiceImpl.addMusic(firstMusic);
        playListServiceImpl.deleteMusicByTitle("The cavemen");
        assertEquals(0, playListServiceImpl.getNumberOfMusic());
    }

    @Test
    void testThatPLaylistCanPlayAllMusic(){
        playListServiceImpl.addMusic(firstMusic);
    }
}
