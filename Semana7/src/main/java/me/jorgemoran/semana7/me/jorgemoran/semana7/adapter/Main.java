package me.jorgemoran.semana7.me.jorgemoran.semana7.adapter;

public class Main {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cancion.mp3");
        audioPlayer.play("mp4", "pelicula.mp4");
        audioPlayer.play("vlc", "serie.vlc");
        audioPlayer.play("avi", "video.avi"); // Este formato no está soportado
    }
}
