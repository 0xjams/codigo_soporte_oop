package me.jorgemoran.semana7.me.jorgemoran.semana7.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String archivo) {
        // No implementado aquí
    }

    @Override
    public void playMp4(String archivo) {
        System.out.println("Reproduciendo archivo MP4: " + archivo);
    }
}
