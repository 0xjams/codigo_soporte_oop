package me.jorgemoran.semana8.adapter;

public class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String filename) {
        System.out.println("AdvancedPlayer -> Reproduciendo un mp4: " + filename);
    }

    @Override
    public void playAvi(String filename) {
        System.out.println("AdvancedPlayer -> Reproduciendo AVI: " + filename);
    }
}
