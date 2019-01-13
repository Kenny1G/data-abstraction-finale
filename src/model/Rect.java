package model;


import sound.MidiSynth;

import java.awt.*;


public class Rect extends Shape {


    public Rect(Point topLeft, MidiSynth midiSynth) {
        this((int) topLeft.getX(), (int) topLeft.getY(), 0, 0); //note to students: calls the other constructor!
        selected = false;
        this.midiSynth = midiSynth;
        instrument = 0;
        playLineCoord = 0;
        PLAYING_COLOR = new Color(230, 158, 60);
    }


    public Rect(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }


}
