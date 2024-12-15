package me.jorgemoran.semana8.adapter;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPLayer;
    public MediaAdapter(){
        this.advancedMediaPLayer=new AdvancedMediaPlayerImpl();
    }
    public void play(String fileName) {
        if(fileName.endsWith(".mp4")) {
            advancedMediaPLayer.playMp4(fileName);
        } else if(fileName.endsWith(".avi")) {
            advancedMediaPLayer.playAvi(fileName);
        } else {
            System.out.println("Formato no soportado");
        }
    }
}
