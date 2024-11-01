package me.jorgemoran.semana7.me.jorgemoran.semana7.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String tipo) {
        switch (tipo.toLowerCase()) {
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
                break;
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
                throw new IllegalArgumentException("Formato no soportado: " + tipo);
        }
    }

    @Override
    public void play(String tipo, String archivo) {
        if (tipo.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(archivo);
        } else if (tipo.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(archivo);
        }
    }
}
