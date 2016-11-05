package com.adapter.pattern;

public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file, name: " + fileName);
    }

    public void playMp4(String fileName) {

    }
}
