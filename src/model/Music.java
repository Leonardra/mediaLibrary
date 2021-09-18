package model;

public class Music {
    private static int counter = 0;
    private Integer musicId;
    private String title;

    public Music(String title) {
        counter++;
        musicId = counter;
        this.title = title;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public String getMusicTitle() {
        return title;
    }
}
