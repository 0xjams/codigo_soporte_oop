package me.jorgemoran.semana8.adapter;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    public AudioPlayer(){
        this.mediaAdapter = new MediaAdapter();
    }

    @Override
    public void play(String filename) {
        if(filename.endsWith(".mp3")) {
            System.out.println("AudioPlayer -> Reproduciendo MP3: " + filename);
        } else {
            mediaAdapter.play(filename);
        }
    }
}
