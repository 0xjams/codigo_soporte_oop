package me.jorgemoran.semana7.me.jorgemoran.semana7.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String tipo, String archivo) {
        if (tipo.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo archivo MP3: " + archivo);
        } else if (tipo.equalsIgnoreCase("mp4") || tipo.equalsIgnoreCase("vlc")) {
            MediaAdapter adapter = new MediaAdapter(tipo);
            adapter.play(tipo, archivo);
        } else {
            System.out.println("Formato no soportado: " + tipo);
        }
    }
}
