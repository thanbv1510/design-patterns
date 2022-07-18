package dev.thanbv1510.patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType) {
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
                break;
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
                throw new UnsupportedOperationException("audio type not support!");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "vlc":
                advancedMediaPlayer.playVlc(fileName);
                break;
            case "mp4":
                advancedMediaPlayer.playMp4(fileName);
                break;
            default:
                throw new UnsupportedOperationException("audio type not support!");
        }
    }
}
