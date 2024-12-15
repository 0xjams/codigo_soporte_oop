package me.jorgemoran.semana8.adapter;

public class MusicApp {
    public static void main(String[] args){
        AudioPlayer player = new AudioPlayer();
        player.play("cancion.mp3");
        player.play("video.avi");
        player.play("video.mp4");
        player.play("video.3gp");
    }
}
