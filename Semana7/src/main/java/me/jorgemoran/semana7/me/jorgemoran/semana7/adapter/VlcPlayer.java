package me.jorgemoran.semana7.me.jorgemoran.semana7.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String archivo) {
        System.out.println("Reproduciendo archivo VLC: " + archivo);
    }

    @Override
    public void playMp4(String archivo) {
        // No implementado aquí
    }
}
