package dev.thanbv1510.patterns.structural.adapter;

public class MainApp {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        // Supported
        audioPlayer.play("mp3", "beyond-the-horizon.mp3");

        // need support for currently
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far-away.vlc");

        // unsupported
        audioPlayer.play("avi", "mind-me.avi");
    }
}
